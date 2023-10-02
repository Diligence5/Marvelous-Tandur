package com.marveloustandur.app.modules.signupcompleteaccount.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.base.BaseActivity
import com.marveloustandur.app.databinding.ActivitySignUpCompleteAccountBinding
import com.marveloustandur.app.extensions.NoInternetConnection
import com.marveloustandur.app.extensions.isJSONObject
import com.marveloustandur.app.extensions.showProgressDialog
import com.marveloustandur.app.modules.jobtype.ui.JobTypeActivity
import com.marveloustandur.app.modules.login.ui.LoginActivity
import com.marveloustandur.app.modules.signupcompleteaccount.`data`.viewmodel.SignUpCompleteAccountVM
import com.marveloustandur.app.network.models.createregister.CreateRegisterResponse
import com.marveloustandur.app.network.resources.ErrorResponse
import com.marveloustandur.app.network.resources.SuccessResponse
import java.lang.Exception
import kotlin.String
import kotlin.Unit
import org.json.JSONObject
import retrofit2.HttpException

class SignUpCompleteAccountActivity :
    BaseActivity<ActivitySignUpCompleteAccountBinding>(R.layout.activity_sign_up_complete_account) {
  private val viewModel: SignUpCompleteAccountVM by viewModels<SignUpCompleteAccountVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpCompleteAccountVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtLargelabelmediu.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageImage.setOnClickListener {
      finish()
    }
  }

  override fun addObservers(): Unit {
    var progressDialog : AlertDialog? = null
    viewModel.progressLiveData.observe(this@SignUpCompleteAccountActivity) {
      if(it) {
        progressDialog?.dismiss()
        progressDialog = null
        progressDialog = this@SignUpCompleteAccountActivity.showProgressDialog()
      } else {
        progressDialog?.dismiss()
      }
    }
    viewModel.createRegisterLiveData.observe(this@SignUpCompleteAccountActivity) {
      if(it is SuccessResponse) {
        val response = it.getContentIfNotHandled()
        onSuccessCreateRegister(it)
      } else if(it is ErrorResponse) {
        onErrorCreateRegister(it.data ?:Exception())
      }
    }
  }

  private fun onSuccessCreateRegister(response: SuccessResponse<CreateRegisterResponse>): Unit {
    viewModel.bindCreateRegisterResponse(response.data)
    val destIntent = JobTypeActivity.getIntent(this, null)
    startActivity(destIntent)
    finish()
  }

  private fun onErrorCreateRegister(exception: Exception): Unit {
    when(exception) {
      is NoInternetConnection -> {
        Snackbar.make(binding.root, exception.message?:"", Snackbar.LENGTH_LONG).show()
      }
      is HttpException -> {
        val errorBody = exception.response()?.errorBody()?.string()
        val errorObject = if (errorBody != null  && errorBody.isJSONObject()) JSONObject(errorBody)
        else JSONObject()
        val errMessage = if(!errorObject.optString("message").isNullOrEmpty()) {
          errorObject.optString("message").toString()
        } else {
          exception.response()?.message()?:""
        }
        Toast.makeText(this@SignUpCompleteAccountActivity,errMessage,Toast.LENGTH_LONG).show()
      }
    }
  }

  companion object {
    const val TAG: String = "SIGN_UP_COMPLETE_ACCOUNT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpCompleteAccountActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

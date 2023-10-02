package com.marveloustandur.app.modules.personalinfo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.base.BaseActivity
import com.marveloustandur.app.databinding.ActivityPersonalInfoBinding
import com.marveloustandur.app.extensions.NoInternetConnection
import com.marveloustandur.app.extensions.showProgressDialog
import com.marveloustandur.app.modules.personalinfo.`data`.viewmodel.PersonalInfoVM
import com.marveloustandur.app.network.models.fetchme.FetchMeResponse
import com.marveloustandur.app.network.resources.ErrorResponse
import com.marveloustandur.app.network.resources.SuccessResponse
import java.lang.Exception
import kotlin.String
import kotlin.Unit

class PersonalInfoActivity :
    BaseActivity<ActivityPersonalInfoBinding>(R.layout.activity_personal_info) {
  private val viewModel: PersonalInfoVM by viewModels<PersonalInfoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.personalInfoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowbackOne.setOnClickListener {
      finish()
    }
  }

  override fun addObservers(): Unit {
    var progressDialog : AlertDialog? = null
    viewModel.progressLiveData.observe(this@PersonalInfoActivity) {
      if(it) {
        progressDialog?.dismiss()
        progressDialog = null
        progressDialog = this@PersonalInfoActivity.showProgressDialog()
      } else {
        progressDialog?.dismiss()
      }
    }
    viewModel.fetchMeLiveData.observe(this@PersonalInfoActivity) {
      if(it is SuccessResponse) {
        val response = it.getContentIfNotHandled()
        onSuccessFetchMe(it)
      } else if(it is ErrorResponse) {
        onErrorFetchMe(it.data ?:Exception())
      }
    }
  }

  private fun onSuccessFetchMe(response: SuccessResponse<FetchMeResponse>): Unit {
    viewModel.bindFetchMeResponse(response.data)
  }

  private fun onErrorFetchMe(exception: Exception): Unit {
    when(exception) {
      is NoInternetConnection -> {
        Snackbar.make(binding.root, exception.message?:"", Snackbar.LENGTH_LONG).show()
      }
    }
  }

  companion object {
    const val TAG: String = "PERSONAL_INFO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PersonalInfoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

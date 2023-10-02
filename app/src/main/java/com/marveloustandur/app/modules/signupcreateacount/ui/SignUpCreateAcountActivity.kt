package com.marveloustandur.app.modules.signupcreateacount.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.base.BaseActivity
import com.marveloustandur.app.appcomponents.googleauth.GoogleHelper
import com.marveloustandur.app.databinding.ActivitySignUpCreateAcountBinding
import com.marveloustandur.app.modules.login.ui.LoginActivity
import com.marveloustandur.app.modules.signupcompleteaccount.ui.SignUpCompleteAccountActivity
import com.marveloustandur.app.modules.signupcreateacount.`data`.viewmodel.SignUpCreateAcountVM
import kotlin.String
import kotlin.Unit

class SignUpCreateAcountActivity :
    BaseActivity<ActivitySignUpCreateAcountBinding>(R.layout.activity_sign_up_create_acount) {
  private val viewModel: SignUpCreateAcountVM by viewModels<SignUpCreateAcountVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpCreateAcountVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error ->

      })
    }

    override fun setUpClicks(): Unit {
      binding.btnContinueWith.setOnClickListener {
        googleLogin.login()
      }
      binding.imageImage.setOnClickListener {
        finish()
      }
      binding.txtLargelabelmediu.setOnClickListener {
        val destIntent = LoginActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.btnContinueWith2.setOnClickListener {
        val destIntent = SignUpCompleteAccountActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "SIGN_UP_CREATE_ACOUNT_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, SignUpCreateAcountActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }

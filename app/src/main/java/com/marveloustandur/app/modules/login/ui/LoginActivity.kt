package com.marveloustandur.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.base.BaseActivity
import com.marveloustandur.app.appcomponents.googleauth.GoogleHelper
import com.marveloustandur.app.databinding.ActivityLoginBinding
import com.marveloustandur.app.modules.enterotp.ui.EnterOtpActivity
import com.marveloustandur.app.modules.login.`data`.viewmodel.LoginVM
import com.marveloustandur.app.modules.signupcreateacount.ui.SignUpCreateAcountActivity
import kotlin.String
import kotlin.Unit

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.btnContinueWith.setOnClickListener {
        googleLogin.login()
      }
      binding.btnContinueWith2.setOnClickListener {
        val destIntent = EnterOtpActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.txtLargelabelmediu.setOnClickListener {
        val destIntent = SignUpCreateAcountActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.imageImage.setOnClickListener {
        finish()
      }
    }

    companion object {
      const val TAG: String = "LOGIN_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, LoginActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }

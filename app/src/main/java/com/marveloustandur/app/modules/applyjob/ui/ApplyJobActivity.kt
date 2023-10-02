package com.marveloustandur.app.modules.applyjob.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.base.BaseActivity
import com.marveloustandur.app.databinding.ActivityApplyJobBinding
import com.marveloustandur.app.modules.applyjob.`data`.viewmodel.ApplyJobVM
import com.marveloustandur.app.modules.applyjobpopup.ui.ApplyJobPopupDialog
import kotlin.String
import kotlin.Unit

class ApplyJobActivity : BaseActivity<ActivityApplyJobBinding>(R.layout.activity_apply_job) {
  private val viewModel: ApplyJobVM by viewModels<ApplyJobVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.applyJobVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnContinue.setOnClickListener {
      val destFragment = ApplyJobPopupDialog.getInstance(null)
      destFragment.show(this.supportFragmentManager, ApplyJobPopupDialog.TAG)
    }
    binding.imageArrowbackOne.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "APPLY_JOB_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ApplyJobActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

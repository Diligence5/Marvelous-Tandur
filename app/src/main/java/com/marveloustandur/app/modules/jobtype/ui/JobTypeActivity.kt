package com.marveloustandur.app.modules.jobtype.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.base.BaseActivity
import com.marveloustandur.app.databinding.ActivityJobTypeBinding
import com.marveloustandur.app.modules.jobtype.`data`.viewmodel.JobTypeVM
import com.marveloustandur.app.modules.speciallization.ui.SpeciallizationActivity
import kotlin.String
import kotlin.Unit

class JobTypeActivity : BaseActivity<ActivityJobTypeBinding>(R.layout.activity_job_type) {
  private val viewModel: JobTypeVM by viewModels<JobTypeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.jobTypeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageImage.setOnClickListener {
      finish()
    }
    binding.btnContinue.setOnClickListener {
      val destIntent = SpeciallizationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "JOB_TYPE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, JobTypeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

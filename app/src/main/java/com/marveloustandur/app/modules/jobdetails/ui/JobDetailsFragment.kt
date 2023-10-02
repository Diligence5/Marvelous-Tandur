package com.marveloustandur.app.modules.jobdetails.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.base.BaseFragment
import com.marveloustandur.app.databinding.FragmentJobDetailsBinding
import com.marveloustandur.app.modules.applyjob.ui.ApplyJobActivity
import com.marveloustandur.app.modules.jobdetails.`data`.viewmodel.JobDetailsVM
import kotlin.String
import kotlin.Unit

class JobDetailsFragment : BaseFragment<FragmentJobDetailsBinding>(R.layout.fragment_job_details) {
  private val viewModel: JobDetailsVM by viewModels<JobDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.jobDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnApplyNow.setOnClickListener {
      val destIntent = ApplyJobActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "JOB_DETAILS_FRAGMENT"


    fun getInstance(bundle: Bundle?): JobDetailsFragment {
      val fragment = JobDetailsFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}

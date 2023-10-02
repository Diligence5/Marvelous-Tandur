package com.marveloustandur.app.modules.appliedjob.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.base.BaseFragment
import com.marveloustandur.app.databinding.FragmentAppliedJobBinding
import com.marveloustandur.app.modules.appliedjob.`data`.viewmodel.AppliedJobVM
import kotlin.String
import kotlin.Unit

class AppliedJobFragment : BaseFragment<FragmentAppliedJobBinding>(R.layout.fragment_applied_job) {
  private val viewModel: AppliedJobVM by viewModels<AppliedJobVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.appliedJobVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "APPLIED_JOB_FRAGMENT"


    fun getInstance(bundle: Bundle?): AppliedJobFragment {
      val fragment = AppliedJobFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}

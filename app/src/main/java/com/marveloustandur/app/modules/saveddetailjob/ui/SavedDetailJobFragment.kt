package com.marveloustandur.app.modules.saveddetailjob.ui

import androidx.fragment.app.viewModels
import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.base.BaseFragment
import com.marveloustandur.app.databinding.FragmentSavedDetailJobBinding
import com.marveloustandur.app.modules.applyjob.ui.ApplyJobActivity
import com.marveloustandur.app.modules.saveddetailjob.`data`.viewmodel.SavedDetailJobVM
import kotlin.String
import kotlin.Unit

class SavedDetailJobFragment :
    BaseFragment<FragmentSavedDetailJobBinding>(R.layout.fragment_saved_detail_job) {
  private val viewModel: SavedDetailJobVM by viewModels<SavedDetailJobVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.savedDetailJobVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnApplyNow.setOnClickListener {
      val destIntent = ApplyJobActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "SAVED_DETAIL_JOB_FRAGMENT"

  }
}

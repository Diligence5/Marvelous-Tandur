package com.marveloustandur.app.modules.applyjobpopup.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.base.BaseDialogFragment
import com.marveloustandur.app.databinding.DialogApplyJobPopupBinding
import com.marveloustandur.app.extensions.loadFragment
import com.marveloustandur.app.modules.appliedjob.ui.AppliedJobFragment
import com.marveloustandur.app.modules.applyjobpopup.`data`.viewmodel.ApplyJobPopupVM
import kotlin.String
import kotlin.Unit

class ApplyJobPopupDialog :
    BaseDialogFragment<DialogApplyJobPopupBinding>(R.layout.dialog_apply_job_popup) {
  private val viewModel: ApplyJobPopupVM by viewModels<ApplyJobPopupVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.applyJobPopupVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnContinue.setOnClickListener {
      val destFragment = AppliedJobFragment.getInstance(null)
      requireActivity().loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = AppliedJobFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "APPLY_JOB_POPUP_DIALOG"


    fun getInstance(bundle: Bundle?): ApplyJobPopupDialog {
      val fragment = ApplyJobPopupDialog()
      fragment.arguments = bundle
      return fragment
    }
  }
}

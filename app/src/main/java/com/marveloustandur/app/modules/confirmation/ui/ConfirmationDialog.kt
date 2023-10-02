package com.marveloustandur.app.modules.confirmation.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.base.BaseDialogFragment
import com.marveloustandur.app.databinding.DialogConfirmationBinding
import com.marveloustandur.app.modules.confirmation.`data`.viewmodel.ConfirmationVM
import com.marveloustandur.app.modules.homecontainer.ui.HomeContainerActivity
import kotlin.String
import kotlin.Unit

class ConfirmationDialog :
    BaseDialogFragment<DialogConfirmationBinding>(R.layout.dialog_confirmation) {
  private val viewModel: ConfirmationVM by viewModels<ConfirmationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.confirmationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnAgreeAnd.setOnClickListener {
      val destIntent = HomeContainerActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "CONFIRMATION_DIALOG"


    fun getInstance(bundle: Bundle?): ConfirmationDialog {
      val fragment = ConfirmationDialog()
      fragment.arguments = bundle
      return fragment
    }
  }
}

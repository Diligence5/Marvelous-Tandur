package com.marveloustandur.app.modules.filter.ui

import androidx.fragment.app.viewModels
import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.marveloustandur.app.databinding.BottomsheetFilterBinding
import com.marveloustandur.app.modules.filter.`data`.viewmodel.FilterVM
import kotlin.String
import kotlin.Unit

class FilterBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetFilterBinding>(R.layout.bottomsheet_filter) {
  private val viewModel: FilterVM by viewModels<FilterVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.filterVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageCloseOne.setOnClickListener {
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "FILTER_BOTTOMSHEET"

  }
}

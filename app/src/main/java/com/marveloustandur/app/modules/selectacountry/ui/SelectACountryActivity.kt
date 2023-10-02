package com.marveloustandur.app.modules.selectacountry.ui

import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.base.BaseActivity
import com.marveloustandur.app.databinding.ActivitySelectACountryBinding
import com.marveloustandur.app.modules.selectacountry.`data`.viewmodel.SelectACountryVM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class SelectACountryActivity :
    BaseActivity<ActivitySelectACountryBinding>(R.layout.activity_select_a_country) {
  private val viewModel: SelectACountryVM by viewModels<SelectACountryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.selectACountryVM = viewModel
    setUpSearchViewSearchListener()
  }

  override fun setUpClicks(): Unit {
    binding.imageCloseOne.setOnClickListener {
      finish()
    }
  }

  private fun setUpSearchViewSearchListener(): Unit {
    binding.searchViewSearch.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "SELECT_A_COUNTRY_ACTIVITY"

    }
  }

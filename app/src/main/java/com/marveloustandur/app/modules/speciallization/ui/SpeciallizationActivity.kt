package com.marveloustandur.app.modules.speciallization.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.base.BaseActivity
import com.marveloustandur.app.databinding.ActivitySpeciallizationBinding
import com.marveloustandur.app.modules.confirmation.ui.ConfirmationDialog
import com.marveloustandur.app.modules.speciallization.`data`.viewmodel.SpeciallizationVM
import kotlin.String
import kotlin.Unit

class SpeciallizationActivity :
    BaseActivity<ActivitySpeciallizationBinding>(R.layout.activity_speciallization) {
  private val viewModel: SpeciallizationVM by viewModels<SpeciallizationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.speciallizationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageImage.setOnClickListener {
      finish()
    }
    binding.btnContinue.setOnClickListener {
      val destFragment = ConfirmationDialog.getInstance(null)
      destFragment.show(this.supportFragmentManager, ConfirmationDialog.TAG)
    }
  }

  companion object {
    const val TAG: String = "SPECIALLIZATION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SpeciallizationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

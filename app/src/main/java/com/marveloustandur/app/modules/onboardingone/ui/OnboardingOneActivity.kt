package com.marveloustandur.app.modules.onboardingone.ui

import androidx.activity.viewModels
import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.base.BaseActivity
import com.marveloustandur.app.databinding.ActivityOnboardingOneBinding
import com.marveloustandur.app.modules.onboardingone.`data`.model.ImageSliderSliderthebestapModel
import com.marveloustandur.app.modules.onboardingone.`data`.viewmodel.OnboardingOneVM
import com.marveloustandur.app.modules.signupcreateacount.ui.SignUpCreateAcountActivity
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class OnboardingOneActivity :
    BaseActivity<ActivityOnboardingOneBinding>(R.layout.activity_onboarding_one) {
  private val imageSliderSliderthebestapItems: ArrayList<ImageSliderSliderthebestapModel> =
      arrayListOf()


  private val viewModel: OnboardingOneVM by viewModels<OnboardingOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sliderthebestapAdapter = SliderthebestapAdapter(imageSliderSliderthebestapItems,true)
    binding.imageSliderSliderthebestap.adapter = sliderthebestapAdapter
    binding.imageSliderSliderthebestap.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorMenuOne.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorMenuOne.updateIndicatorCounts(binding.imageSliderSliderthebestap.indicatorCount)
    binding.onboardingOneVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSliderthebestap.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSliderthebestap.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    binding.txtMediumlabelmedi.setOnClickListener {
      val destIntent = SignUpCreateAcountActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ONBOARDING_ONE_ACTIVITY"

  }
}

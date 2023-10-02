package com.marveloustandur.app.modules.onboardingtwo.ui

import androidx.activity.viewModels
import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.base.BaseActivity
import com.marveloustandur.app.databinding.ActivityOnboardingTwoBinding
import com.marveloustandur.app.modules.onboardingtwo.`data`.model.ImageSliderSliderbetterfutModel
import com.marveloustandur.app.modules.onboardingtwo.`data`.viewmodel.OnboardingTwoVM
import com.marveloustandur.app.modules.signupcreateacount.ui.SignUpCreateAcountActivity
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class OnboardingTwoActivity :
    BaseActivity<ActivityOnboardingTwoBinding>(R.layout.activity_onboarding_two) {
  private val imageSliderSliderbetterfutItems: ArrayList<ImageSliderSliderbetterfutModel> =
      arrayListOf()


  private val viewModel: OnboardingTwoVM by viewModels<OnboardingTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sliderbetterfutAdapter = SliderbetterfutAdapter(imageSliderSliderbetterfutItems,true)
    binding.imageSliderSliderbetterfut.adapter = sliderbetterfutAdapter
    binding.imageSliderSliderbetterfut.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorMenuOne.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorMenuOne.updateIndicatorCounts(binding.imageSliderSliderbetterfut.indicatorCount)
    binding.onboardingTwoVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSliderbetterfut.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSliderbetterfut.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    binding.txtMediumlabelmedi.setOnClickListener {
      val destIntent = SignUpCreateAcountActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ONBOARDING_TWO_ACTIVITY"

  }
}

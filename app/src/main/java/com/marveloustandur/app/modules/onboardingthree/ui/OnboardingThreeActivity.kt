package com.marveloustandur.app.modules.onboardingthree.ui

import androidx.activity.viewModels
import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.base.BaseActivity
import com.marveloustandur.app.databinding.ActivityOnboardingThreeBinding
import com.marveloustandur.app.modules.onboardingthree.`data`.model.ImageSliderSliderapplicatiModel
import com.marveloustandur.app.modules.onboardingthree.`data`.viewmodel.OnboardingThreeVM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class OnboardingThreeActivity :
    BaseActivity<ActivityOnboardingThreeBinding>(R.layout.activity_onboarding_three) {
  private val imageSliderSliderapplicatiItems: ArrayList<ImageSliderSliderapplicatiModel> =
      arrayListOf()


  private val viewModel: OnboardingThreeVM by viewModels<OnboardingThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sliderapplicatiAdapter = SliderapplicatiAdapter(imageSliderSliderapplicatiItems,true)
    binding.imageSliderSliderapplicati.adapter = sliderapplicatiAdapter
    binding.imageSliderSliderapplicati.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorSliderOne.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorSliderOne.updateIndicatorCounts(binding.imageSliderSliderapplicati.indicatorCount)
    binding.onboardingThreeVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSliderapplicati.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSliderapplicati.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ONBOARDING_THREE_ACTIVITY"

  }
}

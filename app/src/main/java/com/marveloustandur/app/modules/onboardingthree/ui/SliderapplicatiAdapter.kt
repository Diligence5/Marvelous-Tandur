package com.marveloustandur.app.modules.onboardingthree.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.marveloustandur.app.databinding.SlideritemOnboardingThree1Binding
import com.marveloustandur.app.modules.onboardingthree.`data`.model.ImageSliderSliderapplicatiModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderapplicatiAdapter(
  val dataList: ArrayList<ImageSliderSliderapplicatiModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderapplicatiModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemOnboardingThree1Binding) {
      binding.imageSliderSliderapplicatiModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemOnboardingThree1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}

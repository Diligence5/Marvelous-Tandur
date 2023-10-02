package com.marveloustandur.app.modules.onboardingtwo.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.marveloustandur.app.databinding.SlideritemOnboardingTwo1Binding
import com.marveloustandur.app.modules.onboardingtwo.`data`.model.ImageSliderSliderbetterfutModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderbetterfutAdapter(
  val dataList: ArrayList<ImageSliderSliderbetterfutModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderbetterfutModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemOnboardingTwo1Binding) {
      binding.imageSliderSliderbetterfutModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemOnboardingTwo1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}

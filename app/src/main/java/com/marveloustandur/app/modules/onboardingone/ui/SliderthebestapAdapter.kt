package com.marveloustandur.app.modules.onboardingone.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.marveloustandur.app.databinding.SlideritemOnboardingOne1Binding
import com.marveloustandur.app.modules.onboardingone.`data`.model.ImageSliderSliderthebestapModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderthebestapAdapter(
  val dataList: ArrayList<ImageSliderSliderthebestapModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderthebestapModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemOnboardingOne1Binding) {
      binding.imageSliderSliderthebestapModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemOnboardingOne1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}

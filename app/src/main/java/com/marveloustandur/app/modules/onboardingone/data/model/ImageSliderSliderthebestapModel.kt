package com.marveloustandur.app.modules.onboardingone.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class ImageSliderSliderthebestapModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtThebestappfor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_best_app_for)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSemperincursus: String? =
      MyApp.getInstance().resources.getString(R.string.msg_semper_in_cursus)

)

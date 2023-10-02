package com.marveloustandur.app.modules.onboardingtwo.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class ImageSliderSliderbetterfutModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBetterfutureis: String? =
      MyApp.getInstance().resources.getString(R.string.msg_better_future_is)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSemperincursus: String? =
      MyApp.getInstance().resources.getString(R.string.msg_semper_in_cursus)

)

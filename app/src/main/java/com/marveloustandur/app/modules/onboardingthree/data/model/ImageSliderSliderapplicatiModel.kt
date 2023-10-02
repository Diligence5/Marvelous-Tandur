package com.marveloustandur.app.modules.onboardingthree.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class ImageSliderSliderapplicatiModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtApplicationsure: String? =
      MyApp.getInstance().resources.getString(R.string.msg_application_surely)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSemperincursus: String? =
      MyApp.getInstance().resources.getString(R.string.msg_semper_in_cursus)

)

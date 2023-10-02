package com.marveloustandur.app.modules.onboardingtwo.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMediumlabelmedi: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)

)

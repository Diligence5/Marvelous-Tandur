package com.marveloustandur.app.modules.onboardingone.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMediumlabelmedi: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)

)

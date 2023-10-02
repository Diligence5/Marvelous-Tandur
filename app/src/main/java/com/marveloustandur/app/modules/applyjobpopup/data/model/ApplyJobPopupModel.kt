package com.marveloustandur.app.modules.applyjobpopup.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class ApplyJobPopupModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTypeThirtyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_success)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourapplication: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_application)

)

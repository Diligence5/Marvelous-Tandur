package com.marveloustandur.app.modules.logoutpopup.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class LogoutPopupModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? = MyApp.getInstance().resources.getString(R.string.lbl_are_you_sure)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeZone: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ullamcorper_imperdiet)

)

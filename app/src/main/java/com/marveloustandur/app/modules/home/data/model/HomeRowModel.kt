package com.marveloustandur.app.modules.home.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class HomeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDigitalmarketin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_digital_marketing)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMotorola: String? = MyApp.getInstance().resources.getString(R.string.lbl_motorola)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_560_12_000_month)

)

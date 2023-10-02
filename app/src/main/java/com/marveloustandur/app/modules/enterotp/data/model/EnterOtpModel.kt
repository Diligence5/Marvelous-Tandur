package com.marveloustandur.app.modules.enterotp.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class EnterOtpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterotp: String? = MyApp.getInstance().resources.getString(R.string.lbl_enter_otp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWehavejustsent: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_have_just_sent)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLargelabelmediu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_didn_t_receive_code)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLargelabelmediu1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_resend_code)

)

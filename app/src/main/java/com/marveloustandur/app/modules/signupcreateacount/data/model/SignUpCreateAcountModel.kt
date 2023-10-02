package com.marveloustandur.app.modules.signupcreateacount.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpCreateAcountModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateaccount: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_create_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdolor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dolor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrcontinuewith: String? =
      MyApp.getInstance().resources.getString(R.string.msg_or_continue_with)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMediumlabelsemi: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLargelabelmediu: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTermAndConditio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_signing_up_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null
)

package com.marveloustandur.app.modules.privacy.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class PrivacyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLegelandpolicie: String? =
      MyApp.getInstance().resources.getString(R.string.msg_legel_and_policies)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTerms: String? = MyApp.getInstance().resources.getString(R.string.lbl_terms)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dolor9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dolor9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangestotheser: String? =
      MyApp.getInstance().resources.getString(R.string.msg_changes_to_the_service)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription2: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dolor9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription3: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dolor9)

)

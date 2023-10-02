package com.marveloustandur.app.modules.newposition.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class NewPositionModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAddnewposition: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_new_position)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMediumlabelsemi: String? = MyApp.getInstance().resources.getString(R.string.lbl_title)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMediumlabelsemi1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_employment_type)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMediumlabelsemi2: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_company_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMediumlabelsemi3: String? = MyApp.getInstance().resources.getString(R.string.lbl_location2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMediumlabelsemi4: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_start_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMediumlabelsemi5: String? = MyApp.getInstance().resources.getString(R.string.lbl_end_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMediumlabelsemi6: String? =
      MyApp.getInstance().resources.getString(R.string.msg_job_role_description)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etNameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etLocationValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentySeveValue: String? = null
)

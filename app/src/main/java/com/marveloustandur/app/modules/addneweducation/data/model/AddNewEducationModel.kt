package com.marveloustandur.app.modules.addneweducation.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class AddNewEducationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAddneweducation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_new_education)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMediumlabelsemi: String? = MyApp.getInstance().resources.getString(R.string.lbl_school)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMediumlabelsemi1: String? = MyApp.getInstance().resources.getString(R.string.lbl_degree)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMediumlabelsemi2: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_field_of_study)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMediumlabelsemi3: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_start_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMediumlabelsemi4: String? = MyApp.getInstance().resources.getString(R.string.lbl_end_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMediumlabelsemi5: String? = MyApp.getInstance().resources.getString(R.string.lbl_grade)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMediumlabelsemi6: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_description)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameoneOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameoneTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupEightyOneValue: String? = null
)

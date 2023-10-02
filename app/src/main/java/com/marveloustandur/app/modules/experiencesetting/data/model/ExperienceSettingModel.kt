package com.marveloustandur.app.modules.experiencesetting.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class ExperienceSettingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtExperience: String? = MyApp.getInstance().resources.getString(R.string.lbl_experience)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExperienceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_experience)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEducation: String? = MyApp.getInstance().resources.getString(R.string.lbl_education)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUniversityofoxf: String? =
      MyApp.getInstance().resources.getString(R.string.msg_university_of_oxford)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSmalllabelregul: String? =
      MyApp.getInstance().resources.getString(R.string.msg_computer_science)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSmalllabelregul1: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_2019)

)

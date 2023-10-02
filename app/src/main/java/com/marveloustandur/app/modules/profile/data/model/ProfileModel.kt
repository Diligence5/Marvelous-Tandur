package com.marveloustandur.app.modules.profile.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGustavolipshutz: String? =
      MyApp.getInstance().resources.getString(R.string.msg_gustavo_lipshutz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUiuxdesignerweb: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ui_ux_designer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTypeSixteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_25)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtApplied: String? = MyApp.getInstance().resources.getString(R.string.lbl_applied)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTypesixteenOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReviewed: String? = MyApp.getInstance().resources.getString(R.string.lbl_reviewed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAboutme: String? = MyApp.getInstance().resources.getString(R.string.lbl_about_me)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dolor8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSkills: String? = MyApp.getInstance().resources.getString(R.string.lbl_skills)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExperience: String? = MyApp.getInstance().resources.getString(R.string.lbl_experience)
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

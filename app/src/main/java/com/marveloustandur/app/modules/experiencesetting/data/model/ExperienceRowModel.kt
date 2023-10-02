package com.marveloustandur.app.modules.experiencesetting.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class ExperienceRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtInternshipuiux: String? =
      MyApp.getInstance().resources.getString(R.string.msg_internship_ui_ux)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSmalllabelregul1: String? = MyApp.getInstance().resources.getString(R.string.lbl_shopee_sg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSmalllabelregul2: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_2019)

)

package com.marveloustandur.app.modules.jobdetails.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class JobDetailsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtJobdescription: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_job_description)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dolor3)

)

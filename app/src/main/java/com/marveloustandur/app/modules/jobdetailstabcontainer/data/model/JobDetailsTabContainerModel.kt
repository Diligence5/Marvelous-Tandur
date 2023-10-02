package com.marveloustandur.app.modules.jobdetailstabcontainer.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class JobDetailsTabContainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtJobdetails: String? = MyApp.getInstance().resources.getString(R.string.lbl_job_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSenioruiuxdesig: String? =
      MyApp.getInstance().resources.getString(R.string.msg_senior_ui_ux_designer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSmalllabelregul: String? = MyApp.getInstance().resources.getString(R.string.lbl_shopee_sg)

)

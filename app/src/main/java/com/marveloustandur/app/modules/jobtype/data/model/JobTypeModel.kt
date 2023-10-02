package com.marveloustandur.app.modules.jobtype.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class JobTypeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChoosejobtype: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_choose_job_type)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAreyoulooking: String? =
      MyApp.getInstance().resources.getString(R.string.msg_are_you_looking)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFindajob: String? = MyApp.getInstance().resources.getString(R.string.lbl_find_a_job)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItseasytofind: String? =
      MyApp.getInstance().resources.getString(R.string.msg_it_s_easy_to_find)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFindaemployee: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_find_a_employee)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItseasytofind1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_it_s_easy_to_find2)

)

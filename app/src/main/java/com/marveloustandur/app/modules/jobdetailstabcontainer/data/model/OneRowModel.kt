package com.marveloustandur.app.modules.jobdetailstabcontainer.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class OneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSalary: String? = MyApp.getInstance().resources.getString(R.string.lbl_salary)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_6k_11k)

)

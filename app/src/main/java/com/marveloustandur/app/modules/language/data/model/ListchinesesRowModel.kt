package com.marveloustandur.app.modules.language.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class ListchinesesRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChineses: String? = MyApp.getInstance().resources.getString(R.string.lbl_chineses)

)

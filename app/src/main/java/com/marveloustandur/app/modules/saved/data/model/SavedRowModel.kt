package com.marveloustandur.app.modules.saved.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class SavedRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUxdesigner: String? = MyApp.getInstance().resources.getString(R.string.lbl_ux_designer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDummystudio: String? = MyApp.getInstance().resources.getString(R.string.lbl_dummy_studio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_560_12_000_month)

)

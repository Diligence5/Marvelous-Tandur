package com.marveloustandur.app.modules.message.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class MessageRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEstherhoward: String? = MyApp.getInstance().resources.getString(R.string.lbl_esther_howard)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdolor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dolor4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup162722: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)

)

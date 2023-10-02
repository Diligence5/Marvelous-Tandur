package com.marveloustandur.app.modules.notificationsgeneral.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class One1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_32_min_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJunioruidesigne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_junior_ui_designer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShopeesg: String? = MyApp.getInstance().resources.getString(R.string.lbl_shopee_sg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdolor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dolor7)

)

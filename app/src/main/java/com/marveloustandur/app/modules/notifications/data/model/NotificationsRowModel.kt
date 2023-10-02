package com.marveloustandur.app.modules.notifications.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNewpost: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_post)

)

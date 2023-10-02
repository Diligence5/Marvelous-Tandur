package com.marveloustandur.app.modules.notificationsmyproposals.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationsMyProposalsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtApplicationstat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_application_status)

)

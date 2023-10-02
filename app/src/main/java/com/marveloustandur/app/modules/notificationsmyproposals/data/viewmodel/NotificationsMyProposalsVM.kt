package com.marveloustandur.app.modules.notificationsmyproposals.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.marveloustandur.app.modules.notificationsmyproposals.`data`.model.ListlocationRowModel
import com.marveloustandur.app.modules.notificationsmyproposals.`data`.model.NotificationsMyProposalsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NotificationsMyProposalsVM : ViewModel(), KoinComponent {
  val notificationsMyProposalsModel: MutableLiveData<NotificationsMyProposalsModel> =
      MutableLiveData(NotificationsMyProposalsModel())

  var navArguments: Bundle? = null

  val listlocationList: MutableLiveData<MutableList<ListlocationRowModel>> =
      MutableLiveData(mutableListOf())
}

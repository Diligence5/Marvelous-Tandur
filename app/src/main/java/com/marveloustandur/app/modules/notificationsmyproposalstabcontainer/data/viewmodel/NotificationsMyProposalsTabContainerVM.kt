package com.marveloustandur.app.modules.notificationsmyproposalstabcontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.marveloustandur.app.modules.notificationsmyproposalstabcontainer.`data`.model.NotificationsMyProposalsTabContainerModel
import org.koin.core.KoinComponent

class NotificationsMyProposalsTabContainerVM : ViewModel(), KoinComponent {
  val notificationsMyProposalsTabContainerModel:
      MutableLiveData<NotificationsMyProposalsTabContainerModel> =
      MutableLiveData(NotificationsMyProposalsTabContainerModel())

  var navArguments: Bundle? = null
}

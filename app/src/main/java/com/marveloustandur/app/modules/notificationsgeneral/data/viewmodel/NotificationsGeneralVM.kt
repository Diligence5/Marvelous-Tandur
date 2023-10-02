package com.marveloustandur.app.modules.notificationsgeneral.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.marveloustandur.app.modules.notificationsgeneral.`data`.model.NotificationsGeneralModel
import com.marveloustandur.app.modules.notificationsgeneral.`data`.model.One1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NotificationsGeneralVM : ViewModel(), KoinComponent {
  val notificationsGeneralModel: MutableLiveData<NotificationsGeneralModel> =
      MutableLiveData(NotificationsGeneralModel())

  var navArguments: Bundle? = null

  val listlogoOneList: MutableLiveData<MutableList<One1RowModel>> = MutableLiveData(mutableListOf())
}

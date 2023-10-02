package com.marveloustandur.app.modules.messageaction.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.marveloustandur.app.modules.messageaction.`data`.model.ActionRowModel
import com.marveloustandur.app.modules.messageaction.`data`.model.MessageActionModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MessageActionVM : ViewModel(), KoinComponent {
  val messageActionModel: MutableLiveData<MessageActionModel> =
      MutableLiveData(MessageActionModel())

  var navArguments: Bundle? = null

  val messageActionList: MutableLiveData<MutableList<ActionRowModel>> =
      MutableLiveData(mutableListOf())
}

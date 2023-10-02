package com.marveloustandur.app.modules.language.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.marveloustandur.app.modules.language.`data`.model.LanguageModel
import com.marveloustandur.app.modules.language.`data`.model.ListchinesesRowModel
import com.marveloustandur.app.modules.language.`data`.model.ListenglishukRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LanguageVM : ViewModel(), KoinComponent {
  val languageModel: MutableLiveData<LanguageModel> = MutableLiveData(LanguageModel())

  var navArguments: Bundle? = null

  val listenglishukList: MutableLiveData<MutableList<ListenglishukRowModel>> =
      MutableLiveData(mutableListOf())

  val listchinesesList: MutableLiveData<MutableList<ListchinesesRowModel>> =
      MutableLiveData(mutableListOf())
}

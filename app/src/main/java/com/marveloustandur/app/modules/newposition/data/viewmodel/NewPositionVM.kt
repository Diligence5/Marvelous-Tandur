package com.marveloustandur.app.modules.newposition.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.marveloustandur.app.modules.newposition.`data`.model.NewPositionModel
import com.marveloustandur.app.modules.newposition.`data`.model.SpinnerArrowdownModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NewPositionVM : ViewModel(), KoinComponent {
  val newPositionModel: MutableLiveData<NewPositionModel> = MutableLiveData(NewPositionModel())

  var navArguments: Bundle? = null

  val spinnerArrowdownList: MutableLiveData<MutableList<SpinnerArrowdownModel>> = MutableLiveData()
}

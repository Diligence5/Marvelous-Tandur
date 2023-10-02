package com.marveloustandur.app.modules.addneweducation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.marveloustandur.app.modules.addneweducation.`data`.model.AddNewEducationModel
import com.marveloustandur.app.modules.addneweducation.`data`.model.SpinnerArrowdownModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AddNewEducationVM : ViewModel(), KoinComponent {
  val addNewEducationModel: MutableLiveData<AddNewEducationModel> =
      MutableLiveData(AddNewEducationModel())

  var navArguments: Bundle? = null

  val spinnerArrowdownList: MutableLiveData<MutableList<SpinnerArrowdownModel>> = MutableLiveData()
}

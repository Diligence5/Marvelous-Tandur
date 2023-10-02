package com.marveloustandur.app.modules.speciallization.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.marveloustandur.app.modules.speciallization.`data`.model.SpeciallizationModel
import org.koin.core.KoinComponent

class SpeciallizationVM : ViewModel(), KoinComponent {
  val speciallizationModel: MutableLiveData<SpeciallizationModel> =
      MutableLiveData(SpeciallizationModel())

  var navArguments: Bundle? = null
}

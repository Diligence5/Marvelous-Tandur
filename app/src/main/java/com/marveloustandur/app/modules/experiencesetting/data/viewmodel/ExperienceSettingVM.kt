package com.marveloustandur.app.modules.experiencesetting.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.marveloustandur.app.modules.experiencesetting.`data`.model.ExperienceRowModel
import com.marveloustandur.app.modules.experiencesetting.`data`.model.ExperienceSettingModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ExperienceSettingVM : ViewModel(), KoinComponent {
  val experienceSettingModel: MutableLiveData<ExperienceSettingModel> =
      MutableLiveData(ExperienceSettingModel())

  var navArguments: Bundle? = null

  val experienceList: MutableLiveData<MutableList<ExperienceRowModel>> =
      MutableLiveData(mutableListOf())
}

package com.marveloustandur.app.modules.jobtype.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.marveloustandur.app.modules.jobtype.`data`.model.JobTypeModel
import org.koin.core.KoinComponent

class JobTypeVM : ViewModel(), KoinComponent {
  val jobTypeModel: MutableLiveData<JobTypeModel> = MutableLiveData(JobTypeModel())

  var navArguments: Bundle? = null
}

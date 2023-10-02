package com.marveloustandur.app.modules.signupcompleteaccount.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.marveloustandur.app.appcomponents.utility.PreferenceHelper
import com.marveloustandur.app.constants.role
import com.marveloustandur.app.constants.user
import com.marveloustandur.app.modules.signupcompleteaccount.`data`.model.SignUpCompleteAccountModel
import com.marveloustandur.app.network.models.createregister.CreateRegisterRequest
import com.marveloustandur.app.network.models.createregister.CreateRegisterResponse
import com.marveloustandur.app.network.repository.NetworkRepository
import com.marveloustandur.app.network.resources.Response
import kotlin.Boolean
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent
import org.koin.core.inject

class SignUpCompleteAccountVM : ViewModel(), KoinComponent {
  val signUpCompleteAccountModel: MutableLiveData<SignUpCompleteAccountModel> =
      MutableLiveData(SignUpCompleteAccountModel())


  var navArguments: Bundle? = null


  val progressLiveData: MutableLiveData<Boolean> = MutableLiveData<Boolean>()

  private val networkRepository: NetworkRepository by inject()

  val createRegisterLiveData: MutableLiveData<Response<CreateRegisterResponse>> =
      MutableLiveData<Response<CreateRegisterResponse>>()

  private val prefs: PreferenceHelper by inject()

  fun callCreateRegisterApi() {
    viewModelScope.launch {
      progressLiveData.postValue(true)
      createRegisterLiveData.postValue(
      networkRepository.createRegister(
      createRegisterRequest = CreateRegisterRequest(
          password = signUpCompleteAccountModel.value?.etPasswordValue,
          role = role.USER,
          name = signUpCompleteAccountModel.value?.etFirstNameValue,
          email = user.EMAIL,
          username = signUpCompleteAccountModel.value?.etLastNameValue)
      )
      )
      progressLiveData.postValue(false)
    }
  }

  fun bindCreateRegisterResponse(response: CreateRegisterResponse) {
    val signUpCompleteAccountModelValue = signUpCompleteAccountModel.value
        ?:SignUpCompleteAccountModel()
    prefs.setId(response.data?.id)
    signUpCompleteAccountModel.value = signUpCompleteAccountModelValue
  }
}

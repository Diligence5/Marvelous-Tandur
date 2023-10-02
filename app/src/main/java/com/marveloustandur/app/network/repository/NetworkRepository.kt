package com.marveloustandur.app.network.repository

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import com.marveloustandur.app.extensions.NoInternetConnection
import com.marveloustandur.app.extensions.isOnline
import com.marveloustandur.app.network.RetrofitServices
import com.marveloustandur.app.network.models.createregister.CreateRegisterRequest
import com.marveloustandur.app.network.models.createregister.CreateRegisterResponse
import com.marveloustandur.app.network.models.fetchme.FetchMeResponse
import com.marveloustandur.app.network.resources.ErrorResponse
import com.marveloustandur.app.network.resources.Response
import com.marveloustandur.app.network.resources.SuccessResponse
import java.lang.Exception
import kotlin.String
import org.koin.core.KoinComponent
import org.koin.core.inject

class NetworkRepository : KoinComponent {
  private val retrofitServices: RetrofitServices by inject()

  private val errorMessage: String = "Something went wrong."

  suspend fun fetchMe(contentType: String?, authorization: String?): Response<FetchMeResponse> =
      try {
    val isOnline = MyApp.getInstance().isOnline()
    if(isOnline) {
      SuccessResponse(retrofitServices.fetchMe(contentType, authorization))
    } else {
      val internetException =
          NoInternetConnection(MyApp.getInstance().getString(R.string.no_internet_connection))
      ErrorResponse(internetException.message ?:errorMessage, internetException)
    }
  } catch(e:Exception) {
    e.printStackTrace()
    ErrorResponse(e.message ?:errorMessage, e)
  }

  suspend fun createRegister(contentType: String?, createRegisterRequest: CreateRegisterRequest?):
      Response<CreateRegisterResponse> = try {
    val isOnline = MyApp.getInstance().isOnline()
    if(isOnline) {
      SuccessResponse(retrofitServices.createRegister(contentType, createRegisterRequest))
    } else {
      val internetException =
          NoInternetConnection(MyApp.getInstance().getString(R.string.no_internet_connection))
      ErrorResponse(internetException.message ?:errorMessage, internetException)
    }
  } catch(e:Exception) {
    e.printStackTrace()
    ErrorResponse(e.message ?:errorMessage, e)
  }
}

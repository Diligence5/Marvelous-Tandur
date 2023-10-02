package com.marveloustandur.app.modules.confirmation.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class ConfirmationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_i_agree_to_the_terms)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMediumlabelmedi: String? = MyApp.getInstance().resources.getString(R.string.lbl_disgree)

)

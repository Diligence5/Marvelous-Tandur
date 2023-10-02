package com.marveloustandur.app.modules.selectacountry.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class SelectACountryModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectacountry: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_a_country2)

)

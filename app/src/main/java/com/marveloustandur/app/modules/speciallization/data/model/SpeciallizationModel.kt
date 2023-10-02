package com.marveloustandur.app.modules.speciallization.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class SpeciallizationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatisyourspeci: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_is_your_specialization)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdolor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dolor2)

)

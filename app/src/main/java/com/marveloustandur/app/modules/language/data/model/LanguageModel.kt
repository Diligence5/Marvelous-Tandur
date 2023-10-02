package com.marveloustandur.app.modules.language.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class LanguageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_language)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSuggestedlangua: String? =
      MyApp.getInstance().resources.getString(R.string.msg_suggested_languages)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOtherlanguages: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_other_languages)

)

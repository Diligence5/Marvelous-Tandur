package com.marveloustandur.app.modules.search.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class SearchModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFindjobs: String? = MyApp.getInstance().resources.getString(R.string.lbl_find_jobs)

)

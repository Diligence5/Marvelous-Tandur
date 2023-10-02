package com.marveloustandur.app.modules.applyjob.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class ApplyJobModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtApplyjob: String? = MyApp.getInstance().resources.getString(R.string.lbl_apply_job)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMediumlabelsemi: String? = MyApp.getInstance().resources.getString(R.string.lbl_full_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMediumlabelsemi1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_email_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMediumlabelsemi2: String? = MyApp.getInstance().resources.getString(R.string.lbl_upload_cv)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUploadfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_upload_file)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMediumlabelsemi3: String? =
      MyApp.getInstance().resources.getString(R.string.msg_website_blog_or)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFullNameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameOneValue: String? = null
)

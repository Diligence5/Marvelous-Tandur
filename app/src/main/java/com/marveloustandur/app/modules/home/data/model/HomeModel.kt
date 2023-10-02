package com.marveloustandur.app.modules.home.`data`.model

import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHiwelcomeback: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hi_welcome_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFindyourdream: String? =
      MyApp.getInstance().resources.getString(R.string.msg_find_your_dream2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMediumlabelsemi: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_recommendation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSenioruiuxdesig: String? =
      MyApp.getInstance().resources.getString(R.string.msg_senior_ui_ux_designer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShopee: String? = MyApp.getInstance().resources.getString(R.string.lbl_shopee)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJakartaindonesi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_jakarta_indonesia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_1100_12_000_month)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFulltime: String? = MyApp.getInstance().resources.getString(R.string.lbl_fulltime)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwoDaysAgo: String? = MyApp.getInstance().resources.getString(R.string.lbl_two_days_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSenioruiuxdesig1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_senior_ui_ux_designer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShopeeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_shopee)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJakartaindonesi1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_jakarta_indonesia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice1: String? = MyApp.getInstance().resources.getString(R.string.msg_1100_12_000_month)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFulltimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_fulltime)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwoDaysAgo1: String? = MyApp.getInstance().resources.getString(R.string.lbl_two_days_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMediumlabelsemi1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_recent_jobs)

)

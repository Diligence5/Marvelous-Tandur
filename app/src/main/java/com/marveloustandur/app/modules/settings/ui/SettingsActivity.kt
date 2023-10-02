package com.marveloustandur.app.modules.settings.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.base.BaseActivity
import com.marveloustandur.app.databinding.ActivitySettingsBinding
import com.marveloustandur.app.modules.experiencesetting.ui.ExperienceSettingActivity
import com.marveloustandur.app.modules.language.ui.LanguageActivity
import com.marveloustandur.app.modules.logoutpopup.ui.LogoutPopupDialog
import com.marveloustandur.app.modules.notifications.ui.NotificationsActivity
import com.marveloustandur.app.modules.personalinfo.ui.PersonalInfoActivity
import com.marveloustandur.app.modules.privacy.ui.PrivacyActivity
import com.marveloustandur.app.modules.settings.`data`.viewmodel.SettingsVM
import kotlin.String
import kotlin.Unit

class SettingsActivity : BaseActivity<ActivitySettingsBinding>(R.layout.activity_settings) {
  private val viewModel: SettingsVM by viewModels<SettingsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.settingsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearAccount.setOnClickListener {
      val destIntent = PersonalInfoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPrivacy.setOnClickListener {
      val destIntent = ExperienceSettingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearNotification.setOnClickListener {
      val destIntent = NotificationsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLegalandpolicie.setOnClickListener {
      val destIntent = PrivacyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtLargelabelmediu.setOnClickListener {
      val destFragment = LogoutPopupDialog.getInstance(null)
      destFragment.show(this.supportFragmentManager, LogoutPopupDialog.TAG)
    }
    binding.linearLanguage.setOnClickListener {
      val destIntent = LanguageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowbackOne.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SETTINGS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SettingsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

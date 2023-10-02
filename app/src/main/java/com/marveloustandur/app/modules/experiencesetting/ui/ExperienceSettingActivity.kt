package com.marveloustandur.app.modules.experiencesetting.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.base.BaseActivity
import com.marveloustandur.app.databinding.ActivityExperienceSettingBinding
import com.marveloustandur.app.modules.addneweducation.ui.AddNewEducationActivity
import com.marveloustandur.app.modules.experiencesetting.`data`.model.ExperienceRowModel
import com.marveloustandur.app.modules.experiencesetting.`data`.viewmodel.ExperienceSettingVM
import com.marveloustandur.app.modules.newposition.ui.NewPositionActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ExperienceSettingActivity :
    BaseActivity<ActivityExperienceSettingBinding>(R.layout.activity_experience_setting) {
  private val viewModel: ExperienceSettingVM by viewModels<ExperienceSettingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val experienceAdapter = ExperienceAdapter(viewModel.experienceList.value?:mutableListOf())
    binding.recyclerExperience.adapter = experienceAdapter
    experienceAdapter.setOnItemClickListener(
    object : ExperienceAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ExperienceRowModel) {
        onClickRecyclerExperience(view, position, item)
      }
    }
    )
    viewModel.experienceList.observe(this) {
      experienceAdapter.updateData(it)
    }
    binding.experienceSettingVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageEditsquareOne.setOnClickListener {
      val destIntent = NewPositionActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnAddNew1.setOnClickListener {
      val destIntent = AddNewEducationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowbackOne.setOnClickListener {
      finish()
    }
    binding.btnAddNew.setOnClickListener {
      val destIntent = NewPositionActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerExperience(
    view: View,
    position: Int,
    item: ExperienceRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "EXPERIENCE_SETTING_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ExperienceSettingActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

package com.marveloustandur.app.modules.addneweducation.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.base.BaseActivity
import com.marveloustandur.app.appcomponents.views.DatePickerFragment
import com.marveloustandur.app.databinding.ActivityAddNewEducationBinding
import com.marveloustandur.app.modules.addneweducation.`data`.model.SpinnerArrowdownModel
import com.marveloustandur.app.modules.addneweducation.`data`.viewmodel.AddNewEducationVM
import com.marveloustandur.app.modules.experiencesetting.ui.ExperienceSettingActivity
import java.util.Date
import kotlin.String
import kotlin.Unit

class AddNewEducationActivity :
    BaseActivity<ActivityAddNewEducationBinding>(R.layout.activity_add_new_education) {
  private val viewModel: AddNewEducationVM by viewModels<AddNewEducationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerArrowdownList.value = mutableListOf(
    SpinnerArrowdownModel("Item1"),
    SpinnerArrowdownModel("Item2"),
    SpinnerArrowdownModel("Item3"),
    SpinnerArrowdownModel("Item4"),
    SpinnerArrowdownModel("Item5")
    )
    val spinnerArrowdownAdapter =
    SpinnerArrowdownAdapter(this,R.layout.spinner_item,viewModel.spinnerArrowdownList.value?:
    mutableListOf())
    binding.spinnerArrowdown.adapter = spinnerArrowdownAdapter
    binding.addNewEducationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSaveChanges.setOnClickListener {
      val destIntent = ExperienceSettingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSelectDate.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
          selectedDate ->
        onDateSelectedBtnSelectDate(selectedDate)
      }
    }
    binding.imageArrowbackOne.setOnClickListener {
      finish()
    }
    binding.btnSelectDate1.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
          selectedDate ->
        onDateSelectedBtnSelectDate1(selectedDate)
      }
    }
  }

  private fun onDateSelectedBtnSelectDate(selectedDate: Date) {
  }

  private fun onDateSelectedBtnSelectDate1(selectedDate: Date) {
  }

  companion object {
    const val TAG: String = "ADD_NEW_EDUCATION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddNewEducationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

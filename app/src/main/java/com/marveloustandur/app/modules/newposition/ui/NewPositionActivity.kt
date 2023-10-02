package com.marveloustandur.app.modules.newposition.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.base.BaseActivity
import com.marveloustandur.app.appcomponents.views.DatePickerFragment
import com.marveloustandur.app.databinding.ActivityNewPositionBinding
import com.marveloustandur.app.modules.experiencesetting.ui.ExperienceSettingActivity
import com.marveloustandur.app.modules.newposition.`data`.model.SpinnerArrowdownModel
import com.marveloustandur.app.modules.newposition.`data`.viewmodel.NewPositionVM
import java.util.Date
import kotlin.String
import kotlin.Unit

class NewPositionActivity : BaseActivity<ActivityNewPositionBinding>(R.layout.activity_new_position)
    {
  private val viewModel: NewPositionVM by viewModels<NewPositionVM>()

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
    binding.newPositionVM = viewModel
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
    binding.btnSelectDate1.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
        selectedDate ->
        onDateSelectedBtnSelectDate1(selectedDate)
      }
    }
    binding.imageArrowbackOne.setOnClickListener {
      finish()
    }
  }

  private fun onDateSelectedBtnSelectDate(selectedDate: Date): Unit {
  }

  private fun onDateSelectedBtnSelectDate1(selectedDate: Date): Unit {
  }

  companion object {
    const val TAG: String = "NEW_POSITION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NewPositionActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

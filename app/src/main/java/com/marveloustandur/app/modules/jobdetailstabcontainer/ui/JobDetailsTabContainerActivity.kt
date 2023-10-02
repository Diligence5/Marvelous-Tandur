package com.marveloustandur.app.modules.jobdetailstabcontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.base.BaseActivity
import com.marveloustandur.app.databinding.ActivityJobDetailsTabContainerBinding
import com.marveloustandur.app.modules.jobdetailstabcontainer.`data`.model.OneRowModel
import com.marveloustandur.app.modules.jobdetailstabcontainer.`data`.viewmodel.JobDetailsTabContainerVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class JobDetailsTabContainerActivity :
    BaseActivity<ActivityJobDetailsTabContainerBinding>(R.layout.activity_job_details_tab_container)
    {
  private val viewModel: JobDetailsTabContainerVM by viewModels<JobDetailsTabContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listwalletOneAdapter =
    ListwalletOneAdapter(viewModel.listwalletOneList.value?:mutableListOf())
    binding.recyclerListwalletOne.adapter = listwalletOneAdapter
    listwalletOneAdapter.setOnItemClickListener(
    object : ListwalletOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : OneRowModel) {
        onClickRecyclerListwalletOne(view, position, item)
      }
    }
    )
    viewModel.listwalletOneList.observe(this) {
      listwalletOneAdapter.updateData(it)
    }
    binding.jobDetailsTabContainerVM = viewModel
    val adapter = JobDetailsTabContainerActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerTabbarview.adapter = adapter
    TabLayoutMediator(binding.tabLayoutTabview,binding.viewPagerTabbarview) { tab, position ->
      tab.text = JobDetailsTabContainerActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
    }

    fun onClickRecyclerListwalletOne(
      view: View,
      position: Int,
      item: OneRowModel
    ): Unit {
      when(view.id) {
      }
    }

    companion object {
      const val TAG: String = "JOB_DETAILS_TAB_CONTAINER_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, JobDetailsTabContainerActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }

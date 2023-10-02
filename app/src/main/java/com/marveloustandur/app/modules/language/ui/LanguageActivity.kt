package com.marveloustandur.app.modules.language.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.base.BaseActivity
import com.marveloustandur.app.databinding.ActivityLanguageBinding
import com.marveloustandur.app.modules.language.`data`.model.ListchinesesRowModel
import com.marveloustandur.app.modules.language.`data`.model.ListenglishukRowModel
import com.marveloustandur.app.modules.language.`data`.viewmodel.LanguageVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LanguageActivity : BaseActivity<ActivityLanguageBinding>(R.layout.activity_language) {
  private val viewModel: LanguageVM by viewModels<LanguageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listenglishukAdapter =
    ListenglishukAdapter(viewModel.listenglishukList.value?:mutableListOf())
    binding.recyclerListenglishuk.adapter = listenglishukAdapter
    listenglishukAdapter.setOnItemClickListener(
    object : ListenglishukAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListenglishukRowModel) {
        onClickRecyclerListenglishuk(view, position, item)
      }
    }
    )
    viewModel.listenglishukList.observe(this) {
      listenglishukAdapter.updateData(it)
    }
    val listchinesesAdapter =
    ListchinesesAdapter(viewModel.listchinesesList.value?:mutableListOf())
    binding.recyclerListchineses.adapter = listchinesesAdapter
    listchinesesAdapter.setOnItemClickListener(
    object : ListchinesesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListchinesesRowModel) {
        onClickRecyclerListchineses(view, position, item)
      }
    }
    )
    viewModel.listchinesesList.observe(this) {
      listchinesesAdapter.updateData(it)
    }
    binding.languageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowbackOne.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListenglishuk(
    view: View,
    position: Int,
    item: ListenglishukRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListchineses(
    view: View,
    position: Int,
    item: ListchinesesRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LANGUAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LanguageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

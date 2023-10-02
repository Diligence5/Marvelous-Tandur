package com.marveloustandur.app.modules.notificationsgeneral.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.base.BaseFragment
import com.marveloustandur.app.databinding.FragmentNotificationsGeneralBinding
import com.marveloustandur.app.modules.notificationsgeneral.`data`.model.One1RowModel
import com.marveloustandur.app.modules.notificationsgeneral.`data`.viewmodel.NotificationsGeneralVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NotificationsGeneralFragment :
    BaseFragment<FragmentNotificationsGeneralBinding>(R.layout.fragment_notifications_general) {
  private val viewModel: NotificationsGeneralVM by viewModels<NotificationsGeneralVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listlogoOneAdapter =
    ListlogoOneAdapter(viewModel.listlogoOneList.value?:mutableListOf())
    binding.recyclerListlogoOne.adapter = listlogoOneAdapter
    listlogoOneAdapter.setOnItemClickListener(
    object : ListlogoOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : One1RowModel) {
        onClickRecyclerListlogoOne(view, position, item)
      }
    }
    )
    viewModel.listlogoOneList.observe(requireActivity()) {
      listlogoOneAdapter.updateData(it)
    }
    binding.notificationsGeneralVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListlogoOne(
    view: View,
    position: Int,
    item: One1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATIONS_GENERAL_FRAGMENT"

  }
}

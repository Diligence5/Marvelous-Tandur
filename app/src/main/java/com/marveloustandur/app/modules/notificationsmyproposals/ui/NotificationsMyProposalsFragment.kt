package com.marveloustandur.app.modules.notificationsmyproposals.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.base.BaseFragment
import com.marveloustandur.app.databinding.FragmentNotificationsMyProposalsBinding
import com.marveloustandur.app.modules.notificationsmyproposals.`data`.model.ListlocationRowModel
import com.marveloustandur.app.modules.notificationsmyproposals.`data`.viewmodel.NotificationsMyProposalsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NotificationsMyProposalsFragment :
    BaseFragment<FragmentNotificationsMyProposalsBinding>(R.layout.fragment_notifications_my_proposals)
    {
  private val viewModel: NotificationsMyProposalsVM by viewModels<NotificationsMyProposalsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listlocationAdapter =
    ListlocationAdapter(viewModel.listlocationList.value?:mutableListOf())
    binding.recyclerListlocation.adapter = listlocationAdapter
    listlocationAdapter.setOnItemClickListener(
    object : ListlocationAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListlocationRowModel) {
        onClickRecyclerListlocation(view, position, item)
      }
    }
    )
    viewModel.listlocationList.observe(requireActivity()) {
      listlocationAdapter.updateData(it)
    }
    binding.notificationsMyProposalsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListlocation(
    view: View,
    position: Int,
    item: ListlocationRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATIONS_MY_PROPOSALS_FRAGMENT"

  }
}

package com.marveloustandur.app.modules.message.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.viewModels
import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.base.BaseFragment
import com.marveloustandur.app.databinding.FragmentMessageBinding
import com.marveloustandur.app.modules.chat.ui.ChatActivity
import com.marveloustandur.app.modules.message.`data`.model.MessageRowModel
import com.marveloustandur.app.modules.message.`data`.viewmodel.MessageVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MessageFragment : BaseFragment<FragmentMessageBinding>(R.layout.fragment_message) {
  private val viewModel: MessageVM by viewModels<MessageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val messageAdapter = MessageAdapter(viewModel.messageList.value?:mutableListOf())
    binding.recyclerMessage.adapter = messageAdapter
    messageAdapter.setOnItemClickListener(
    object : MessageAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MessageRowModel) {
        onClickRecyclerMessage(view, position, item)
      }
    }
    )
    viewModel.messageList.observe(requireActivity()) {
      messageAdapter.updateData(it)
    }
    binding.messageVM = viewModel
    setUpSearchViewSearchListener()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowbackOne.setOnClickListener {
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerMessage(
    view: View,
    position: Int,
    item: MessageRowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowesther -> {
        val destIntent = ChatActivity.getIntent(requireActivity(), null)
        startActivity(destIntent)
        requireActivity().onBackPressed()
      }
    }
  }

  private fun setUpSearchViewSearchListener(): Unit {
    binding.searchViewSearch.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "MESSAGE_FRAGMENT"


      fun getInstance(bundle: Bundle?): MessageFragment {
        val fragment = MessageFragment()
        fragment.arguments = bundle
        return fragment
      }
    }
  }

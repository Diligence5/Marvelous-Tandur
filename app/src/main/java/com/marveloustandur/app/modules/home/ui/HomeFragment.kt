package com.marveloustandur.app.modules.home.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.marveloustandur.app.R
import com.marveloustandur.app.appcomponents.base.BaseFragment
import com.marveloustandur.app.databinding.FragmentHomeBinding
import com.marveloustandur.app.extensions.loadFragment
import com.marveloustandur.app.modules.home.`data`.model.HomeRowModel
import com.marveloustandur.app.modules.home.`data`.viewmodel.HomeVM
import com.marveloustandur.app.modules.jobdetails.ui.JobDetailsFragment
import com.marveloustandur.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val homeAdapter = HomeAdapter(viewModel.homeList.value?:mutableListOf())
    binding.recyclerHome.adapter = homeAdapter
    homeAdapter.setOnItemClickListener(
    object : HomeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomeRowModel) {
        onClickRecyclerHome(view, position, item)
      }
    }
    )
    viewModel.homeList.observe(requireActivity()) {
      homeAdapter.updateData(it)
    }
    binding.homeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.searchViewSearch.setOnClickListener {
      val destIntent = SearchActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerHome(
    view: View,
    position: Int,
    item: HomeRowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumnspacer -> {
        onClickRecyclerHomeLinearColumnspacer(view, position, item)
      }
    }
  }

  fun onClickRecyclerHomeLinearColumnspacer(
    view: View,
    position: Int,
    item: HomeRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destFragment = JobDetailsFragment.getInstance(null)
        requireActivity().loadFragment(
        R.id.fragmentContainer,
        destFragment,
        bundle = destFragment.arguments,
        tag = JobDetailsFragment.TAG,
        addToBackStack = true,
        add = false,
        enter = null,
        exit = null,
        )
        requireActivity().onBackPressed()
      }
      1 -> {
        val destFragment = JobDetailsFragment.getInstance(null)
        requireActivity().loadFragment(
        R.id.fragmentContainer,
        destFragment,
        bundle = destFragment.arguments,
        tag = JobDetailsFragment.TAG,
        addToBackStack = true,
        add = false,
        enter = null,
        exit = null,
        )
        requireActivity().onBackPressed()
      }
    }
  }

  companion object {
    const val TAG: String = "HOME_FRAGMENT"


    fun getInstance(bundle: Bundle?): HomeFragment {
      val fragment = HomeFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}

package com.marveloustandur.app.modules.jobdetailstabcontainer.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.marveloustandur.app.R
import com.marveloustandur.app.databinding.RowOneBinding
import com.marveloustandur.app.modules.jobdetailstabcontainer.`data`.model.OneRowModel
import kotlin.Int
import kotlin.collections.List

class ListwalletOneAdapter(
  var list: List<OneRowModel>
) : RecyclerView.Adapter<ListwalletOneAdapter.RowOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_one,parent,false)
    return RowOneVH(view)
  }

  override fun onBindViewHolder(holder: RowOneVH, position: Int) {
    val oneRowModel = OneRowModel()
    // TODO uncomment following line after integration with data source
    // val oneRowModel = list[position]
    holder.binding.oneRowModel = oneRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<OneRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: OneRowModel
    ) {
    }
  }

  inner class RowOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowOneBinding = RowOneBinding.bind(itemView)
  }
}

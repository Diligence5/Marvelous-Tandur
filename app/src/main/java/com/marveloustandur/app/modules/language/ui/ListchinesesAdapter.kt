package com.marveloustandur.app.modules.language.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.marveloustandur.app.R
import com.marveloustandur.app.databinding.RowListchinesesBinding
import com.marveloustandur.app.modules.language.`data`.model.ListchinesesRowModel
import kotlin.Int
import kotlin.collections.List

class ListchinesesAdapter(
  var list: List<ListchinesesRowModel>
) : RecyclerView.Adapter<ListchinesesAdapter.RowListchinesesVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListchinesesVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listchineses,parent,false)
    return RowListchinesesVH(view)
  }

  override fun onBindViewHolder(holder: RowListchinesesVH, position: Int) {
    val listchinesesRowModel = ListchinesesRowModel()
    // TODO uncomment following line after integration with data source
    // val listchinesesRowModel = list[position]
    holder.binding.listchinesesRowModel = listchinesesRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListchinesesRowModel>) {
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
      item: ListchinesesRowModel
    ) {
    }
  }

  inner class RowListchinesesVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListchinesesBinding = RowListchinesesBinding.bind(itemView)
  }
}

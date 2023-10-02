package com.marveloustandur.app.modules.notificationsgeneral.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.marveloustandur.app.R
import com.marveloustandur.app.databinding.RowOne1Binding
import com.marveloustandur.app.modules.notificationsgeneral.`data`.model.One1RowModel
import kotlin.Int
import kotlin.collections.List

class ListlogoOneAdapter(
  var list: List<One1RowModel>
) : RecyclerView.Adapter<ListlogoOneAdapter.RowOne1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowOne1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_one1,parent,false)
    return RowOne1VH(view)
  }

  override fun onBindViewHolder(holder: RowOne1VH, position: Int) {
    val one1RowModel = One1RowModel()
    // TODO uncomment following line after integration with data source
    // val one1RowModel = list[position]
    holder.binding.one1RowModel = one1RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<One1RowModel>) {
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
      item: One1RowModel
    ) {
    }
  }

  inner class RowOne1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowOne1Binding = RowOne1Binding.bind(itemView)
  }
}

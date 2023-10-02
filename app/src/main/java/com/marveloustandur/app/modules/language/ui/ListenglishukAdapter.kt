package com.marveloustandur.app.modules.language.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.marveloustandur.app.R
import com.marveloustandur.app.databinding.RowListenglishukBinding
import com.marveloustandur.app.modules.language.`data`.model.ListenglishukRowModel
import kotlin.Int
import kotlin.collections.List

class ListenglishukAdapter(
  var list: List<ListenglishukRowModel>
) : RecyclerView.Adapter<ListenglishukAdapter.RowListenglishukVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListenglishukVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listenglishuk,parent,false)
    return RowListenglishukVH(view)
  }

  override fun onBindViewHolder(holder: RowListenglishukVH, position: Int) {
    val listenglishukRowModel = ListenglishukRowModel()
    // TODO uncomment following line after integration with data source
    // val listenglishukRowModel = list[position]
    holder.binding.listenglishukRowModel = listenglishukRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListenglishukRowModel>) {
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
      item: ListenglishukRowModel
    ) {
    }
  }

  inner class RowListenglishukVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListenglishukBinding = RowListenglishukBinding.bind(itemView)
  }
}

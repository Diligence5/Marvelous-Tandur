package com.marveloustandur.app.modules.messageaction.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.marveloustandur.app.R
import com.marveloustandur.app.databinding.RowActionBinding
import com.marveloustandur.app.modules.messageaction.`data`.model.ActionRowModel
import kotlin.Int
import kotlin.collections.List

class MessageActionAdapter(
  var list: List<ActionRowModel>
) : RecyclerView.Adapter<MessageActionAdapter.RowActionVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowActionVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_action,parent,false)
    return RowActionVH(view)
  }

  override fun onBindViewHolder(holder: RowActionVH, position: Int) {
    val actionRowModel = ActionRowModel()
    // TODO uncomment following line after integration with data source
    // val actionRowModel = list[position]
    holder.binding.actionRowModel = actionRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ActionRowModel>) {
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
      item: ActionRowModel
    ) {
    }
  }

  inner class RowActionVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowActionBinding = RowActionBinding.bind(itemView)
    init {
      binding.linearRowesther.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ActionRowModel())
      }
      binding.frameChat.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ActionRowModel())
      }
    }
  }
}

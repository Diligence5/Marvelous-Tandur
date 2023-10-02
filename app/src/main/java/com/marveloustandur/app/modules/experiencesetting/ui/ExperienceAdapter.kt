package com.marveloustandur.app.modules.experiencesetting.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.marveloustandur.app.R
import com.marveloustandur.app.databinding.RowExperienceBinding
import com.marveloustandur.app.modules.experiencesetting.`data`.model.ExperienceRowModel
import kotlin.Int
import kotlin.collections.List

class ExperienceAdapter(
  var list: List<ExperienceRowModel>
) : RecyclerView.Adapter<ExperienceAdapter.RowExperienceVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowExperienceVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_experience,parent,false)
    return RowExperienceVH(view)
  }

  override fun onBindViewHolder(holder: RowExperienceVH, position: Int) {
    val experienceRowModel = ExperienceRowModel()
    // TODO uncomment following line after integration with data source
    // val experienceRowModel = list[position]
    holder.binding.experienceRowModel = experienceRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ExperienceRowModel>) {
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
      item: ExperienceRowModel
    ) {
    }
  }

  inner class RowExperienceVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowExperienceBinding = RowExperienceBinding.bind(itemView)
  }
}

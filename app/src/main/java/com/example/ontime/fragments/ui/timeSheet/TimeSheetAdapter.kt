package com.example.ontime.fragments.ui.timeSheet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ontime.R

// https://www.youtube.com/watch?v=5mdV1hLbXzo
class TimeSheetAdapter(private val timeSheetList: List<TimeSheet>) : RecyclerView.Adapter<TimeSheetAdapter.TimeSheetHolder>() {

    //https://www.youtube.com/watch?v=dB9JOsVx-yY


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TimeSheetHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_time_sheet, parent, false)
        return TimeSheetHolder(itemView)
    }

    override fun getItemCount(): Int {
        return timeSheetList.size
    }

    override fun onBindViewHolder(holder: TimeSheetHolder, position: Int) {
        val currentItem = timeSheetList[position]
        holder.timeSheetImage.setImageResource(currentItem.tsImage)
        holder.timeSheetCategory.text = currentItem.tsCategory
        holder.timeSheetDescription.text = currentItem.tsDescription
        holder.projectHours.text = currentItem.tsHours

    }

    class TimeSheetHolder(private val projectView: View) : RecyclerView.ViewHolder(projectView){
        val timeSheetImage: ImageView = projectView.findViewById(R.id.timesheet_image)
        val timeSheetCategory: TextView = projectView.findViewById(R.id.timesheet_category)
        val timeSheetDescription: TextView = projectView.findViewById(R.id.timesheet_category)
        val projectHours: TextView = projectView.findViewById(R.id.timesheet_hours)
        /*init {

            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }

            addProjectBtn.setOnClickListener {
                listener.onAddButtonClicked(adapterPosition)
            }

            deleteProjectBtn.setOnClickListener {
                listener.onDeleteButtonClicked(adapterPosition)
            }

        }*/
    }
}
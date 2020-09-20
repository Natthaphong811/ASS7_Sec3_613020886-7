package com.example.ass7dialogrv

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import layout.ViewHolder

class EmployeesAdapter(val item: List<Employee>, val context: Context) :
    RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view_item = LayoutInflater.from(parent.context)
            .inflate(R.layout.employee_item_layout, parent, false)
        return ViewHolder(view_item)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvName?.text = item[position].name
        holder.tvGender?.text = item[position].gender
        holder.tvEmail?.text = item[position].email
        holder.tvSalary?.text = item[position].salary.toString()
    }

    override fun getItemCount(): Int {
        return item.size
    }

}
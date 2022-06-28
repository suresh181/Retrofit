package com.my.taskretrofit

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(
    private val context:Context,
    private val mList:List<ItemViewHistory>): RecyclerView.Adapter<RecyclerViewAdapter.HistoryHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryHolder {
        println("##---->> onCreateViewHolder called ")
        val view =LayoutInflater.from(context).inflate(R.layout.card_design_task,parent,false)
        return HistoryHolder(view)
    }

    override fun onBindViewHolder(holder: HistoryHolder, position: Int) {
        val itemList =mList[position]
        holder.id.text=itemList.id
        holder.name.text=itemList.name
        holder.date.text=itemList.date
        holder.time.text=itemList.time
        holder.cost.text=itemList.cost
    }

    override fun getItemCount(): Int {
        println("##---->> getItemCount called "+mList.size)
        return mList.size
    }
    class HistoryHolder(ItemView:View):RecyclerView.ViewHolder(ItemView) {
        val id:TextView =itemView.findViewById(R.id.tv_id)
        val name:TextView = itemView.findViewById(R.id.tv_ea)
        val date:TextView = itemView.findViewById(R.id.tv_date)
        val time:TextView = itemView.findViewById(R.id.tv_minute)
        val cost:TextView = itemView.findViewById(R.id.tv_cost)


        }

}
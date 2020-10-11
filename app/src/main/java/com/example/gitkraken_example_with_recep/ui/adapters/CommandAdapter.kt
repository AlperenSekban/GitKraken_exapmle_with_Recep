package com.example.gitkraken_example_with_recep.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gitkraken_example_with_recep.R
import com.example.gitkraken_example_with_recep.data.models.CommandModel

class CommandAdapter(var context: Context, var list: List<CommandModel>) :
    RecyclerView.Adapter<CommandAdapter.Define>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommandAdapter.Define {
        val commandLayout=LayoutInflater.from(context).inflate(R.layout.recyclerview_commandlist_layout,parent,false)
        return Define(commandLayout)
    }

    override fun onBindViewHolder(holder: CommandAdapter.Define, position: Int) {
        holder.commandTitle?.text=list?.get(position).text.toString()
        holder.commanDetail?.text=list?.get(position).detail.toString()
    }

    override fun getItemCount(): Int {
        return list?.size
    }

    inner class Define(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var commandTitle: TextView? = null
        var commanDetail: TextView? = null

        init {
            commandTitle=itemView.findViewById(R.id.recyclerview_commandlist_layout_title_textView)
            commanDetail=itemView.findViewById(R.id.recyclerview_commandlist_layout_detail_textView)
        }
    }

}
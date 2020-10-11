package com.example.gitkraken_example_with_recep.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gitkraken_example_with_recep.R
import com.example.gitkraken_example_with_recep.data.models.CategoriesModel


class CategoryAdapter(val context: Context, val sendId: SendId) :
    RecyclerView.Adapter<CategoryAdapter.Define>() {

    lateinit var liste: List<CategoriesModel>

    inner class Define(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var categoryAdapter_textView: TextView

        init {
            categoryAdapter_textView =
                itemView.findViewById(R.id.layout_home_catogories_catogory_textView)
            itemView.setOnClickListener(View.OnClickListener {
                sendId.onItemClick(position = adapterPosition)
            })
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Define {
        val categoryLayout =
            LayoutInflater.from(context).inflate(R.layout.layout_home_catogories, parent, false)
        return Define(categoryLayout)
    }

    override fun getItemCount(): Int {
        return liste.size
    }

    override fun onBindViewHolder(holder: Define, position: Int) {
        holder.categoryAdapter_textView.text = liste.get(position).title
    }

    fun setData(liste: List<CategoriesModel>) {
        this.liste = liste;
        notifyDataSetChanged()
    }


}
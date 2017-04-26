package com.manumanu.goodwishes.views.adapters

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.manumanu.goodwishes.R
import com.manumanu.goodwishes.data.Wish
import com.manumanu.goodwishes.util.*

import kotlinx.android.synthetic.main.item_wish.view.*


/**
 * Created by manu on 08/04/17.
 */

class WishAdapter(var items: List<Wish>) : RecyclerView.Adapter<WishAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder.itemView){
            tv_name.text = items[position].name
            tv_description.text = items[position].description

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(parent.inflate(R.layout.item_wish))
    }

    override fun getItemCount(): Int {
        return items.size
    }


    class ViewHolder(view:View) : RecyclerView.ViewHolder(view)
}

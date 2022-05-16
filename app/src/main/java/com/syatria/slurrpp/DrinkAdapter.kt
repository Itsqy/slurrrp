package com.syatria.slurrpp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syatria.slurrpp.room.Drink
import kotlinx.android.synthetic.main.activity_detail_drink.view.*
import kotlinx.android.synthetic.main.item_row_list.view.*

class DrinkAdapter(var drinks: ArrayList<Drink>, var listener: OnAdapterListener) :
    RecyclerView.Adapter<DrinkAdapter.DrinkViewHolder>() {
    class DrinkViewHolder(val view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DrinkViewHolder {
        return DrinkViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_row_list, parent, false)
        )
    }


    override fun getItemCount() = drinks.size

    override fun onBindViewHolder(holder: DrinkViewHolder, position: Int) {


        val drink = drinks[position]
        holder.view.tv_drink.text = drink.name
    

//        show the image


        holder.view.img_drink.setImageResource(drink.image)
        holder.view.setOnClickListener {
            listener.onClick(drink) //pass the drink to the listener
        }


    }

}

interface OnAdapterListener {
    fun onClick(drink: Drink)
}

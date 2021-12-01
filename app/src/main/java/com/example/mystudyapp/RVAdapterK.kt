package com.example.mystudyapp

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card_view_kot.view.*

interface ItemClickListener{
    fun onClick(id: Int)
}

class RVAdapterK(
    val cards: ArrayList<String>, val content: ArrayList<String>,
    val ItemClickListener: ItemClickListener
): RecyclerView.Adapter<RVAdapterK.ListHolder>()
{
    class ListHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListHolder {
        return ListHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.card_view_kot,
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ListHolder, position: Int) {
        val card = this.cards[position]
        val cont = content[position]

        holder.itemView.apply {
            cvKot.textView3.text = "Note ${position + 1} :" + card
            cvKot.tvContentA.text = cont

            cvKot.setOnClickListener {
                ItemClickListener.onClick(position)
                Log.d("test_one", "clicked $position")
            }

        }
        holder.itemView.setOnClickListener { ItemClickListener.onClick(position) }

    }

    override fun getItemCount(): Int = cards.size
}
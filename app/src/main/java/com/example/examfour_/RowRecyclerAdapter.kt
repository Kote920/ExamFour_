package com.example.examfour_

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.examfour_.databinding.ItemRecyclerviewThreeBinding

class RowRecyclerAdapter(private val rows: MutableList<MutableList<ButtonBlank>>): RecyclerView.Adapter<RowRecyclerAdapter.ItemsViewHolder>() {

    inner class ItemsViewHolder(val binding: ItemRecyclerviewThreeBinding) :
        RecyclerView.ViewHolder(binding.root) {
            fun bind(){
                val row = rows[adapterPosition]
                with(binding){
                    if(row.size == 5){
                    btn1.setImageResource(row[0].src)
                    btn2.setImageResource(row[1].src)
                    btn3.setImageResource(row[2].src)
                    btn4.setImageResource(row[3].src)
                    btn5.setImageResource(row[4].src)
                    }
                    else if(row.size == 4){
                        btn1.setImageResource(row[0].src)
                        btn2.setImageResource(row[1].src)
                        btn3.setImageResource(row[2].src)
                        btn4.setImageResource(row[3].src)
                    }
                    else if(row.size == 3){
                        btn1.setImageResource(row[0].src)
                        btn2.setImageResource(row[1].src)
                        btn3.setImageResource(row[2].src)
                    }
                }
            }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsViewHolder {
        return ItemsViewHolder(
            ItemRecyclerviewThreeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return rows.size
    }

    override fun onBindViewHolder(holder: ItemsViewHolder, position: Int) {
        holder.bind()
    }

}
package com.example.teaming

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MemberAdapter(val itemList: ArrayList<MemberData>) :
    RecyclerView.Adapter<MemberAdapter.MemberViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.member_item, parent, false)
        return MemberViewHolder(view)
    }

    override fun onBindViewHolder(holder: MemberViewHolder, position: Int) {
        val imageData = itemList[position]

        holder.apply {
            if (imageData.img == "no_profile"){
                Glide.with(itemView.context)
                    .load(R.drawable.no_profile)
                    .error(R.drawable.no_profile)
                    .into(image)
            }else{
                Glide.with(itemView.context)
                    .load(imageData.img)
                    .error(R.drawable.profile_default)
                    .into(image)
            }
        }
    }

    override fun getItemCount(): Int {
        return itemList.count()
    }


    inner class MemberViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<ImageView>(R.id.imageView)
        val image2 = itemView.findViewById<ImageView>(R.id.imageView2)
    }
}
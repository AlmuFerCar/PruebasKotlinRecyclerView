package com.almufc.pruebaskotlinrecyclerview.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.almufc.pruebaskotlinrecyclerview.R
import com.almufc.pruebaskotlinrecyclerview.SuperHero
import com.bumptech.glide.Glide

class SuperHeroViewHolder (view: View):RecyclerView.ViewHolder(view)
{
    val superHero = view.findViewById<TextView>(R.id.tvSuperHeroName)
    val realName = view.findViewById<TextView>(R.id.tvSuperHeroRealName)
    val publisher = view.findViewById<TextView>(R.id.tvPublisher)
    val photo = view.findViewById<ImageView>(R.id.ivSuperHero)

    fun render(superHeroModel:SuperHero)
    {
        superHero.text =superHeroModel.superhero
        realName.text =superHeroModel.realName
        publisher.text = superHeroModel.publisher
        Glide.with(photo.context).load(superHeroModel.photo).into(photo)
    }
}
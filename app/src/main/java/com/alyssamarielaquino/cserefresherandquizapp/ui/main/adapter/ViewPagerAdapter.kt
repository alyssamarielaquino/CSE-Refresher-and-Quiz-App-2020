package com.alyssamarielaquino.cserefresherandquizapp.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.alyssamarielaquino.cserefresherandquizapp.R
import kotlinx.android.synthetic.main.layout_onboarding_screen.view.*


class ViewPagerAdapter : RecyclerView.Adapter<PagerVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH =
        PagerVH(LayoutInflater.from(parent.context).inflate(R.layout.layout_onboarding_screen, parent, false))



    override fun getItemCount(): Int = 3

    override fun onBindViewHolder(holder: PagerVH, position: Int) = holder.itemView.run {



        if(position == 0){
            tvTitle.text = "Study"
            tvAbout.text = "Read a refresher course on English, Filipino, Math, Logic, and General Information"
            ivImage.setImageResource(R.drawable.onboarding_refresher)


        }

        if(position == 1) {
            tvTitle.text = "Test"
            tvAbout.text = "Take a sample reviewer quiz to test your knowledge"
            ivImage.setImageResource(R.drawable.onboarding_quiz)


        }
        if(position == 2) {
            tvTitle.text = "Information"
            tvAbout.text = "Check out information about the civil service examination"
            ivImage.setImageResource(R.drawable.onboarding_info)

        }


    }
}



class PagerVH(itemView: View) : RecyclerView.ViewHolder(itemView)
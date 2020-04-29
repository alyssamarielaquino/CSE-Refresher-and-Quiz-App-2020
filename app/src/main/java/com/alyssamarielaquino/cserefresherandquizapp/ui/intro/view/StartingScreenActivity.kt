package com.alyssamarielaquino.cserefresherandquizapp.ui.intro.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.alyssamarielaquino.cserefresherandquizapp.R
import com.alyssamarielaquino.cserefresherandquizapp.ui.intro.adapter.ViewPagerAdapter
import com.alyssamarielaquino.cserefresherandquizapp.ui.auth.view.LoginActivity
import com.alyssamarielaquino.cserefresherandquizapp.ui.auth.view.RegisterActivity
import kotlinx.android.synthetic.main.activity_starting_screen.*


class StartingScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_starting_screen)


        view_pager2.adapter =
            ViewPagerAdapter()

        view_pager2.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback(){

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                updateIndicators(position)

                if (position < 2){
                    intro_btn_next.visibility = View.VISIBLE
                    intro_btn_finish.visibility = View.GONE
                }
                else {
                    intro_btn_next.visibility = View.GONE
                    intro_btn_finish.visibility = View.VISIBLE
                }

            }
        })


        intro_btn_skip.setOnClickListener {
            Intent(applicationContext, LoginActivity::class.java).also{
                startActivity(it)
            }


        }

        intro_btn_next.setOnClickListener {
            if (view_pager2.currentItem < 2){
                view_pager2.currentItem +=1
            }

        }

        intro_btn_finish.setOnClickListener {
                Intent(applicationContext, RegisterActivity::class.java).also{
                    startActivity(it)
                }


        }



    }
    fun updateIndicators(position: Int) {

        var indicators = arrayListOf<ImageView>(intro_indicator_0, intro_indicator_1, intro_indicator_2)
        for (i in 0 until indicators.size) {
            indicators[i].setBackgroundResource(
                if (i == position) R.drawable.indicator_selected else R.drawable.indicator_unselected
            )
        }
    }


}

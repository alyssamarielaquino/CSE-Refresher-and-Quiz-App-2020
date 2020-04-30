package com.alyssamarielaquino.cserefresherandquizapp.ui.home.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.alyssamarielaquino.cserefresherandquizapp.ui.home.view.InformationFragment
import com.alyssamarielaquino.cserefresherandquizapp.ui.home.view.QuizFragment
import com.alyssamarielaquino.cserefresherandquizapp.ui.home.view.RefresherFragment


class HomeViewPagerAdapter internal constructor(fm: FragmentManager) : FragmentPagerAdapter(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val count = 3

    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = RefresherFragment()
            1 -> fragment = QuizFragment()
            2 -> fragment = InformationFragment()
        }

        return fragment!!
    }


    override fun getCount(): Int {
        return count
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return "Tab " + (position + 1)
    }
}
package com.example.myandroidmaterialtabs

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by Darush on 1/18/2018.
 */
class SampleAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? = when (position) {
        0 -> FragmentOne.newInstance()
        1 -> FragmentTwo.newInstance()
        2 -> FragmentThree.newInstance()
        else -> null
    }

    // If you don't want tab texts and want only icons then don't override this method
    override fun getPageTitle(position: Int): CharSequence = when (position) {
        0 -> "Tab 1"
        1 -> "Tab 2"
        2 -> "Tab 3"
        else -> ""
    }

    override fun getCount(): Int = 3

}
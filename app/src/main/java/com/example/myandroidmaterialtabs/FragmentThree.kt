package com.example.myandroidmaterialtabs

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Darush on 1/17/2018.
 */
class FragmentThree : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? = inflater!!.inflate(R.layout.fragment_three, container, false)

    companion object {
        fun newInstance(): FragmentThree = FragmentThree()
    }
}
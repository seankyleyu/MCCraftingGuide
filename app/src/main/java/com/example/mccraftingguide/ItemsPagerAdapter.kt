package com.example.mccraftingguide

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.mccraftingguide.fragments.*

class ItemsPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    private val fragmentType: MutableList<Fragment> = ArrayList()
    private val fragmentTitle: MutableList<String> = ArrayList()

    override fun getItem(position: Int): Fragment {

        return fragmentType[position]

    }

    override fun getCount(): Int {

        return fragmentType.size

    }

    fun addFragment(type: Fragment, title:String){

        fragmentType.add(type)
        fragmentTitle.add(title)

    }

    override fun getPageTitle(position: Int): CharSequence?{

        return fragmentTitle[position]

    }
}
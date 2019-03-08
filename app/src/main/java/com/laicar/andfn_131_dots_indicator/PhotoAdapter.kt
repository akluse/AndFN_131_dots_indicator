package com.laicar.andfn_131_dots_indicator

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class PhotoAdapter : PagerAdapter {
    private lateinit var mContext: Context
    val images = mutableListOf<Int>(
        R.drawable.photo1, R.drawable.photo2,
        R.drawable.photo3
    );

    constructor(context: Context) : super() {
        this.mContext = context;

    }

    override fun isViewFromObject(p0: View, p1: Any): Boolean {
        return p0 == p1
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val inflater = LayoutInflater.from(mContext)
        val layout = inflater.inflate(R.layout.page_item, container, false)
        val imgView =layout.findViewById<ImageView>(R.id.imageView)
        imgView.setImageResource(images[position])
        container.addView(layout)
        return layout

    }

    override fun destroyItem(container: ViewGroup, position: Int, view: Any) {
        container.removeView(view as View)

    }

    override fun getCount(): Int {
        return images.count()
    }

}
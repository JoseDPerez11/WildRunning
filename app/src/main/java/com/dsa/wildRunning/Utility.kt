package com.dsa.wildRunning

import android.widget.LinearLayout
import android.widget.LinearLayout.LayoutParams

object Utility {

    fun setHeightLinearLayout(ly: LinearLayout, value: Int) {
        val params: LinearLayout.LayoutParams = ly.layoutParams as LayoutParams
        params.height = value
        ly.layoutParams = params
    }

}
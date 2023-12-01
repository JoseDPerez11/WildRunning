package com.dsa.wildRunning

import android.animation.ObjectAnimator
import android.view.View
import android.widget.LinearLayout
import android.widget.LinearLayout.LayoutParams

object Utility {

    /* funciones de animación y cambio de atributos */
    fun setHeightLinearLayout(ly: LinearLayout, value: Int) {
        val params: LinearLayout.LayoutParams = ly.layoutParams as LayoutParams
        params.height = value
        ly.layoutParams = params
    }

    fun animateViewofInt(v: View, attr: String, value: Int, time: Long) {
        ObjectAnimator.ofInt(v, attr, value).apply {
            duration = time
            start()
        }
    }

    fun animateViewofFloat(v: View, attr: String, value: Float, time: Long) {
        ObjectAnimator.ofFloat(v, attr, value).apply {
            duration = time
            start()
        }
    }

}
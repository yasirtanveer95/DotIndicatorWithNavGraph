package com.example.dotinticatornavgraph

import android.content.Context
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.view.children
import androidx.core.view.setMargins

fun addDots(context: Context, llDots: LinearLayout, count: Int) {
    llDots.removeAllViews()
    repeat(count) {
        val childView = ImageView(context).apply {
            layoutParams = LinearLayout.LayoutParams(20, 20).apply {
                setMargins(5)
            }
            setBackgroundResource(R.drawable.default_dot)
        }
        llDots.addView(childView)
    }

}

fun selectDots(llDots: LinearLayout, position: Int) {
    llDots.children.forEachIndexed { index, view ->
        if (index == position)
            view.setBackgroundResource(R.drawable.selected_dot)
        else
            view.setBackgroundResource(R.drawable.default_dot)
    }
}
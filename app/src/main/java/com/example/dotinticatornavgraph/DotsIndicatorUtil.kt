package com.example.dotinticatornavgraph

import android.content.Context
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
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

@Composable
fun ShowDots(totalCount: Int, selectedPosition: Int) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(5.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            repeat(totalCount) {
                Box(
                    modifier = Modifier
                        .width(
                            if (it == selectedPosition) 7.dp.times(3)
                            else 7.dp
                        )
                        .animateContentSize(
                            tween(
                                durationMillis = 300,
                                easing = LinearOutSlowInEasing
                            )
                        )
                        .height(7.dp)
                        .clip(CircleShape)
                        .background(
                            if (it == selectedPosition) MaterialTheme.colors.primary
                            else MaterialTheme.colors.secondary.copy(alpha = 1f)
                        )
                )
            }
        }
    }
}

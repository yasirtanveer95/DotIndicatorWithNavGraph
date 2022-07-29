package com.example.dotinticatornavgraph

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.payment_nav_Host) as NavHostFragment
        addDots(this, llDots, navHostFragment.navController.graph.count())
        navHostFragment.navController.addOnDestinationChangedListener { controller, destination, arguments ->
            when (destination.id) {
                R.id.blankFragment1 -> {
                    selectDots(llDots, 0)
                    Toast.makeText(
                        this,
                        "1",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                R.id.blankFragment2 -> {
                    selectDots(llDots, 1)
                    Toast.makeText(
                        this,
                        "2",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                R.id.blankFragment3 -> {
                    selectDots(llDots, 2)
                    Toast.makeText(
                        this,
                        "3",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                R.id.blankFragment4 -> {
                    selectDots(llDots, 3)
                    Toast.makeText(
                        this,
                        "4",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
        ivCross.setOnClickListener {
            finish()
        }
        ivBack.setOnClickListener {
            navHostFragment.navController.popBackStack()
        }
    }
}
package com.balbasio.monthsapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var monthsList=ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    monthsList.add("January")
    monthsList.add("February")
        monthsList.add("March")
        monthsList.add("April")
        monthsList.add("May")
        monthsList.add("June")
        monthsList.add("July")
        monthsList.add("August")
        monthsList.add("September")
        monthsList.add("October")
        monthsList.add("November")
        monthsList.add("December")
        val index = monthsList.indexOf("January")
        monthsFun(index)
    }

    private fun monthsFun(index: Int) {
        var index2 = index
        januaryButton.setOnClickListener {
            if (index2 == 0) {
                januaryButton.setBackgroundColor(Color.GREEN)
                index2 += 1
            } else {
                januaryButton.setBackgroundColor(Color.RED)
            }
        }
        februaryButton.setOnClickListener {
            if (index2 == 1) {
                februaryButton.setBackgroundColor(Color.GREEN)
                index2 += 1
            } else {
                februaryButton.setBackgroundColor(Color.RED)
            }
        }
        marchButton.setOnClickListener {
            if (index2 == 2) {
                marchButton.setBackgroundColor(Color.GREEN)
                index2 += 1
            } else {
                marchButton.setBackgroundColor(Color.RED)

            }
        }
        aprilButton.setOnClickListener {
            if (index2 == 3) {
                aprilButton.setBackgroundColor(Color.GREEN)
                index2 += 1
            } else {
                aprilButton.setBackgroundColor(Color.RED)
            }
        }

        mayButton.setOnClickListener {
            if (index2 == 4) {
                mayButton.setBackgroundColor(Color.GREEN)
                index2 += 1
            } else {
                mayButton.setBackgroundColor(Color.RED)
            }
        }
        juneButton.setOnClickListener {
            if (index2 == 5) {
                juneButton.setBackgroundColor(Color.GREEN)
                index2 += 1
            } else {
                juneButton.setBackgroundColor(Color.RED)
            }
        }

        julyButton.setOnClickListener {
            if (index2 == 6) {
                julyButton.setBackgroundColor(Color.GREEN)
                index2 += 1
            } else {
                julyButton.setBackgroundColor(Color.RED)
            }
        }
        augustButton.setOnClickListener {
            if (index2 == 7) {
                augustButton.setBackgroundColor(Color.GREEN)
                index2 += 1
            } else {
                augustButton.setBackgroundColor(Color.RED)
            }
        }
        septemberButton.setOnClickListener {
            if (index2 == 8) {
                septemberButton.setBackgroundColor(Color.GREEN)
                index2 += 1
            } else {
                septemberButton.setBackgroundColor(Color.RED)
            }
        }
        octoberButton.setOnClickListener {
            if (index2 == 9) {
                octoberButton.setBackgroundColor(Color.GREEN)
                index2 += 1
            } else {
                octoberButton.setBackgroundColor(Color.RED)
            }
        }
        novemberButton.setOnClickListener {
            if (index2 == 10) {
                novemberButton.setBackgroundColor(Color.GREEN)
                index2 += 1
            } else {
                novemberButton.setBackgroundColor(Color.RED)
            }
        }
        decemberButton.setOnClickListener {
            if (index2 == 11) {
                decemberButton.setBackgroundColor(Color.GREEN)
                index2 += 1
            } else {
                decemberButton.setBackgroundColor(Color.RED)
            }
        }



    }
}
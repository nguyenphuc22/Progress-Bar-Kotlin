package com.example.progressbarkotlinreal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    fun download(view : View) {

        val countDownTimer = object : CountDownTimer(10000,500) {
            override fun onTick(millisUntilFinished: Long) {
                if (progressBar.progress < progressBar.max) {

                    progressBar.progress += 10

                } else {

                    progressBar.progress = 0

                }

                if (progressBar.secondaryProgress < progressBar.max) {

                    progressBar.secondaryProgress += 5

                } else {

                    progressBar.secondaryProgress = 0

                }
            }

            override fun onFinish() {
                Toast.makeText(this@MainActivity,"Finish",Toast.LENGTH_SHORT).show()
            }

        }

        countDownTimer.start()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
package com.example.aplicacao01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSum.setOnClickListener (object: View.OnClickListener{
            override fun onClick(v: View?) {
                val num1 = number01.text.toString().toInt()
                val num2 = number02.text.toString().toInt()
                val res = num1 + num2
                callToast(res)
            }
        })
        buttonSub.setOnClickListener (object: View.OnClickListener{
            override fun onClick(v: View?) {
                val num1 = number01.text.toString().toInt()
                val num2 = number02.text.toString().toInt()
                val res = num1 - num2
                callToast(res)
            }
        })
        buttonMult.setOnClickListener (object: View.OnClickListener{
            override fun onClick(v: View?) {
                val num1 = number01.text.toString().toInt()
                val num2 = number02.text.toString().toInt()
                val res = num1 * num2
                callToast(res)
            }
        })
        buttonDiv.setOnClickListener (object: View.OnClickListener{
            override fun onClick(v: View?) {
                val num1 = number01.text.toString().toInt()
                val num2 = number02.text.toString().toInt()
                val res = num1 / num2
                callToast(res)
            }
        })
    }

    fun callToast(res: Int) {
        Toast.makeText(this@MainActivity,res.toString(),Toast.LENGTH_SHORT).show()
    }

}


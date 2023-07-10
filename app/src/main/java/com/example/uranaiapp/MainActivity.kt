package com.example.uranaiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //idを取得
        val tv :TextView = findViewById(R.id.uranaiText)
        val btn :Button = findViewById(R.id.uranaiBtn)

        //クリック処理
        btn.setOnClickListener {
            val msg = arrayOf("大吉", "吉", "中吉", "小吉", "凶", "大凶")
            //乱数
            val num = Random().nextInt(msg.size)
            tv.text = msg[num]
        }
    }
}

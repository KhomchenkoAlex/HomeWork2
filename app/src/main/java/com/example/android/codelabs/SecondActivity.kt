package com.example.android.codelabs

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.textView_random
import kotlinx.android.synthetic.main.activity_second.textView_label
import java.util.*

class SecondActivity : AppCompatActivity() {
    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    fun showRandomNumber() {
        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        var randomInt = 0

        if (count > 0) {
            randomInt = Random().nextInt(count + 1)
        }

        textView_random.text = randomInt.toString()
        textView_label.text = getString(R.string.random_heading, count)
    }
}

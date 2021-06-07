package ru.alexeysekatskiy.nvvmpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var myObserver: MyLifecycleObserver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myObserver = MyLifecycleObserver()
        lifecycle.addObserver(myObserver)

        button.setOnClickListener {
            textPane.text = editName.text
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.run {
            putString("key", textPane.text.toString())
        }

        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        textPane.text = savedInstanceState?.getString("key")
    }
}
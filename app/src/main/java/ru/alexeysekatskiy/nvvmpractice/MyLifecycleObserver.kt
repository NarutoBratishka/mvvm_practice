package ru.alexeysekatskiy.nvvmpractice

import android.app.Activity
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

class MyLifecycleObserver: LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun myFun(owner: LifecycleOwner, event: Lifecycle.Event) {
        Log.d("qwe", "$event")
        Toast.makeText((owner as Activity).applicationContext, "$event", Toast.LENGTH_SHORT).show() //Нехорошо)
    }
}
package com.example.databinding

import android.content.Context
import android.view.View
import android.widget.Toast

class ClickHandlers( var context: Context) {

    fun displaymsg(view: View){
        Toast.makeText(context," You clicked Me", Toast.LENGTH_SHORT).show()
    }
}
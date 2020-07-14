package com.example.coronainhindi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class DosAndDonts : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dos_and_donts)
        val title = intent.getStringExtra("title")
        setTitle(title)
        var x =-1
        var image : ImageView =findViewById(R.id.doimg)

        image.setOnClickListener(View.OnClickListener {

        if(x%2!=0)
       image.setImageResource(R.drawable.don1)
            else
            image.setImageResource(R.drawable.do1)
            x++


        })
    }
}

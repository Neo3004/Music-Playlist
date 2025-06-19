package com.example.musicplaylist

import android.R.attr.button
import android.annotation.SuppressLint

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



private fun Int.setOnClickListener(function: () -> Unit)
{
}

class List : AppCompatActivity()
{

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?)
    {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val listOutput = findViewById<TextView>(R.id.listOutput)
        val showAllButton = findViewById<Button>(R.id.showAllButton)
        showAllButton.setOnClickListener{
            listOutput.text=getFormattedList(showAll=true)
        }
        val showFilteredButton = findViewById<Button>(R.id.showFilteredButton)
        showFilteredButton.setOnClickListener{
            listOutput.text=getFormattedList(showAll=false)
        }
        val backButton = findViewById<Button>(R.id.backButton)
        button.setOnClickListener{
            val startActivity (Intent(this, MainActivity::class.java))

        }
    }



    private fun getFormattedList(showAll:Boolean):String{
        val result= StringBuilder()
        for (i in MainActivity.songs.indices){
            if (showAll||MainActivity.ratings[i]>=3){
                result.append("song:${MainActivity.songs[i]}\n")
                result.append("artist:${MainActivity.artists[i]}\n")
                result.append("rating:${MainActivity.ratings[i]}\n")
                result.append("comment:${MainActivity.comments[i]}\n\n")
            }
                
        }
    return if (result.isEmpty())"No items to show." else result.toString()
}

 
    
    

   

    
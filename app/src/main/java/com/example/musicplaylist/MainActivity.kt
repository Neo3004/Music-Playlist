package com.example.musicplaylist



import android.content.Intent
import android.os.Bundle

import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.musicplaylist.R.id
import kotlin.jvm.java


class MainActivity : ComponentActivity()
{
    companion object{
      val songs= mutableListOf<String>()
      val artists=mutableListOf<String>()
        val ratings=mutableListOf<Int>()
        var comments=mutableListOf<String>()
    }
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val songInput = findViewById<EditText>(id.songInput)
        val artistInput = findViewById<EditText>(id.artist)
        val ratingsInput = findViewById<EditText>(id.ratingsInput)
        val commentInput = findViewById<EditText>(id.commentInput)

        val addButton = findViewById<Button>(id.addButton)
        val viewListButton = findViewById<Button>(id.viewListButton)
        val exitButton = findViewById<Button>(id.exitButton)


            val song = songInput.text.toString().trim()
            val artist = artistInput.text.toString().trim()
            val rating = ratingsInput.text.toString().trim()
            val comment = commentInput.text.toString().trim()

            if (song.isEmpty() || artist.isEmpty() || ratings.isEmpty() || comment.isEmpty())
            {
                Toast.makeText(this, "All fields are required", Toast.LENGTH_SHORT).show()
                return

            }
            val ratings = rating.toIntOrNull()
            if (ratings == null || rating <= 0.toString())
            {
                Toast.makeText(this, "Enter a valid rating", Toast.LENGTH_SHORT).show()
                return
            }
            songs.add(song)
            artists.add(artist)
            Companion.ratings.add(ratings)
            comments.add(comment)
            Toast.makeText(this, "Item added successfully", Toast.LENGTH_SHORT).show()

            songInput.text.clear()
            artistInput.text.clear()
            ratingsInput.text.clear()
            commentInput.text.clear()

            viewListButton.setOnClickListener {
                startActivity(Intent(this, List::class.java))

            }
            exitButton.setOnClickListener {
                finishAffinity()
            }
        }
    }







     
     
     

     

















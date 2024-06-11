package com.example.interactive_ui

import android.os.Bundle
import android.widget.Button;
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.interactive_ui.ui.theme.Interactive_UITheme


class MainActivity : ComponentActivity() {
private var mCount =0; //to update the textView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        val toastButton: Button = findViewById(R.id.button_toast);
        val value: TextView = findViewById(R.id.textView_value);
        val countButton: Button = findViewById(R.id.button_count);

        toastButton.setOnClickListener{
//      lambda expression used to provide direct working for setOnClickListener method
            mCount=0;
            value.text = mCount.toString();
            Toast.makeText(this@MainActivity , "Hello Programmer!", Toast.LENGTH_SHORT).show();

//      this refers to activity where button is defined
        }
        countButton.setOnClickListener{
            mCount++
            // Update the UI or perform other actions based on the new count value
            value.text = mCount.toString();
        }
    }
}
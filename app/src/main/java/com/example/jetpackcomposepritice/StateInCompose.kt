package com.example.jetpackcomposepritice

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun CounterExample(modifier: Modifier = Modifier) {

    var count by remember { mutableStateOf(0) }

    Column {
        Text(text = "$count")

        Button(onClick = {
            count ++
        })
        {
            Text("Increment")
        }
    }
}
package com.example.jetpackcomposepritice

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable

fun Greet(name : String, age : Int){

    Text("Hello $name You are $age year old")
}

@Composable
@Preview(showSystemUi = true)
fun ColumnLayoutExample(modifier: Modifier = Modifier) {
    
}
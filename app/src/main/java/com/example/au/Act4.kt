package com.example.au

import androidx.compose.runtime.mutableStateSetOf
import androidx.compose.runtime.remember
import java.lang.reflect.Modifier

@composable
fun FormDataDiri(modifier: Modifier){
    var textNama by remember { mutableStateSetOf(value ="") }
}
package com.example.au

import androidx.compose.runtime.mutableStateSetOf
import androidx.compose.runtime.remember
import java.lang.reflect.Modifier

@composable
fun FormDataDiri(modifier: Modifier){
    var textNama by remember { mutableStateSetOf(value ="")}
    var textAlamat by remember { mutableStateSetOf(value ="")}
    var textJK by remember { mutableStateSetOf(value ="")}
    val gender:List<String> = listof("Laki-laki", "Perempuan")

    var nama by remember { mutableStateSetOf(value ="")}
    var alamat by remember { mutableStateSetOf(value ="")}
    var jenis by remember { mutableStateSetOf(value ="")}

    column(modifier = Modifier.padding(top = 50.dp))
}
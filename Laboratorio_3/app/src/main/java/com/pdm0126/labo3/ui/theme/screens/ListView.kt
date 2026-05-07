package com.pdm0126.labo3.ui.theme.screens

import android.net.TetheringManager
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable

fun ListView(
    navigateToBack : () -> Unit
){
    Scaffold { innerPadding ->
        var nombre by remember { mutableStateOf("") }
        var listaNombres = remember { mutableStateListOf<String>() }

        Column(
            modifier = Modifier.fillMaxSize().padding(innerPadding)
        ) {

            TextField(
                value = nombre,
                onValueChange = { nombre = it },
                label = { Text("Nombre") },
                modifier = Modifier.fillMaxWidth().padding(bottom = 20.dp)
            )

            Button(
                onClick = {
                    if (nombre.isNotEmpty()) {
                        listaNombres.add(nombre)
                        nombre = ""
                    }
                },
                modifier = Modifier.align(Alignment.CenterHorizontally).padding(bottom = 20.dp)
            ) {
                Text("Guardar")
            }



            Row(
                modifier = Modifier.fillMaxWidth().padding(bottom = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("Listado de nombres y \nposición en la lista")

                Button(
                    onClick = {
                        listaNombres.clear()
                    }
                ) {
                    Text("Limpiar")
                }
            }


            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .border(3.dp, Color.Blue, RoundedCornerShape(16.dp))
                    .padding(17.dp)
            ) {
                itemsIndexed(listaNombres) { index, nombreItem ->
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(nombreItem)
                        Text("${index + 1}")
                    }
                }
            }
            Button(
                onClick = navigateToBack
            ) {
                Text("Regresar")
            }
        }
    }

}

package com.example.praktikum_8.ui.view.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.praktikum_8.model.Mahasiswa
import com.example.praktikum_8.model.RencanaStudy

@Composable
fun DetailView(
    mahasiswa: Mahasiswa,
    rencanaStudy: RencanaStudy,
    modifier: Modifier = Modifier,
    onBackButtonClicked: () -> Unit
) {
    val listDetailData = listOf(
        Pair("Nama Mahasiswa", mahasiswa.nama),
        Pair("NIM", mahasiswa.nim),
        Pair("Email", mahasiswa.email),
        Pair("Mata Kuliah", rencanaStudy.namaMk),
        Pair("Kelas", rencanaStudy.kelasMk)
    )

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        ElevatedButton(
            onClick = { onBackButtonClicked() }
        ) {
            Text(text = "Kembali")
        }

        listDetailData.forEach { detail ->
            DetailRow(label = detail.first, value = detail.second)
        }
    }
}
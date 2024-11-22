package com.example.praktikum_8.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.praktikum_8.model.RencanaStudy
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class RencanaStudyViewModel : ViewModel() {
    private val _krsState = MutableStateFlow(RencanaStudy())
    val  krsStateUi: StateFlow<RencanaStudy> = _krsState.asStateFlow()

    fun setMataKuliah(mkPilihan: String) {
        _krsState.update { stateMK -> stateMK.copy(namaMk = mkPilihan) }
    }

    fun setKelas(kelasPilihan: String) {
        _krsState.update { stateKelas -> stateKelas.copy(kelasMk = kelasPilihan) }
    }

    fun saveDataKRS(ls: MutableList<String>){
        _krsState.update { status ->status.copy(
            namaMk = ls[0],
            kelasMk = ls[1]
        ) }
    }
}
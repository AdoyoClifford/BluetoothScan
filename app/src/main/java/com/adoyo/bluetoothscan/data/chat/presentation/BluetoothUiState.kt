package com.adoyo.bluetoothscan.data.chat.presentation

import com.adoyo.bluetoothscan.domain.chat.BluetoothDevice

data class BluetoothUiState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList()
)

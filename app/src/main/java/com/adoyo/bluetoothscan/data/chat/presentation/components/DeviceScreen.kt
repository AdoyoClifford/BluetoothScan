package com.adoyo.bluetoothscan.data.chat.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.adoyo.bluetoothscan.data.chat.presentation.BluetoothUiState

@Composable
fun DeviceScreen(
    state : BluetoothUiState,
    onStartScan: () -> Unit,
    onStartStop: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {


    }
}

@Composable
fun BluetoothDeviceList(
    pairedDevices: () -> Unit
) {

}
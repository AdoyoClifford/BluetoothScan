package com.adoyo.bluetoothscan.data.chat

import android.bluetooth.BluetoothManager
import android.content.Context
import com.adoyo.bluetoothscan.domain.chat.BluetoothController
import com.adoyo.bluetoothscan.domain.chat.BluetoothDevice
import com.adoyo.bluetoothscan.domain.chat.BluetoothDeviceDomain
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class AndroidBluetoothController(
    private val context: Context
) : BluetoothController {
    private val bluetoothManger by lazy {
        context.getSystemService(BluetoothManager::class.java)
    }

    private val _scannedDevices = MutableStateFlow<List<BluetoothDeviceDomain>>(emptyList())
    override val scannedDevices: StateFlow<List<BluetoothDeviceDomain>>
        get() = _scannedDevices.asStateFlow()

    private val _pairedDevices = MutableStateFlow<List<BluetoothDeviceDomain>>(emptyList())
    override val pairedDevices: StateFlow<List<BluetoothDeviceDomain>>
        get() = _pairedDevices.asStateFlow()

    override fun startDiscovery() {
        TODO("Not yet implemented")
    }

    override fun stopDiscovery() {
        TODO("Not yet implemented")
    }

    override fun release() {
        TODO("Not yet implemented")
    }
}
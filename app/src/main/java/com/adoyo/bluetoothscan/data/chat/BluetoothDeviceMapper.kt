package com.adoyo.bluetoothscan.data.chat

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.adoyo.bluetoothscan.domain.chat.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}
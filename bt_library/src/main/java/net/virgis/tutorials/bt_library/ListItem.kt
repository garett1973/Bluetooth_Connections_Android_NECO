package net.virgis.tutorials.bt_library

import android.bluetooth.BluetoothDevice

data class ListItem(
    val device: BluetoothDevice,
    val isChecked: Boolean
)

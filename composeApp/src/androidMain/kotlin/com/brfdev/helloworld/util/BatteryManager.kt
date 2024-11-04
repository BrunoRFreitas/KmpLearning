package com.brfdev.helloworld.util

import android.content.Context
import android.content.Intent

actual class BatteryManager(
    private val context: Context,
) {
    actual fun getBatteryLevel(): Int {
        val intentFilter = android.content.IntentFilter(Intent.ACTION_BATTERY_CHANGED)
        val batteryStatus = context.registerReceiver(null, intentFilter)
        val level = batteryStatus?.getIntExtra(android.os.BatteryManager.EXTRA_LEVEL, -1) ?: -1
        val scale = batteryStatus?.getIntExtra(android.os.BatteryManager.EXTRA_SCALE, -1) ?: -1
        return (level / scale.toFloat() * 100).toInt()
    }
}
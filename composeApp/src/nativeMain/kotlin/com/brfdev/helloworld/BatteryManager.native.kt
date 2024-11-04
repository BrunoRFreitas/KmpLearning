package com.brfdev.helloworld

import platform.UIKit.UIDevice

actual class BatteryManager {
    actual fun getBatteryLevel(): Int {
        UIDevice.currentDevice.batteryLevel.toInt()
        val batteryLevel = UIDevice.currentDevice.batteryLevel
        return (batteryLevel * 100).toInt()
    }
}
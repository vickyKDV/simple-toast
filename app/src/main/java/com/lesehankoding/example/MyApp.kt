package com.lesehankoding.example

import android.app.*
import com.lesehankoding.simpletoast.*

class MyApp:Application() {
	override fun onCreate() {
		super.onCreate()
		RegisterToastContext.appContext = this
	}
}
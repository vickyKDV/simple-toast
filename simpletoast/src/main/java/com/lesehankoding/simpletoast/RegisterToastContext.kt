package com.lesehankoding.simpletoast

import android.app.*
class RegisterToastContext:Application() {
	companion object {
		var appContext: Application? = null
	}
	override fun onCreate() {
		super.onCreate()
		appContext = this
	}
}
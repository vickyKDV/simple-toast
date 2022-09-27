package com.lesehankoding.simpletoast.Enum

import android.icu.text.*
import android.view.*

//sealed class position(val position: Int) {
//	object BOTTOM : position(Gravity.BOTTOM)
//	object TOP : position(Gravity.TOP)
//	object CENTER : position(Gravity.CENTER)
//}

sealed class ToastPosition(val pos:Int) {
	object BOTTOM : ToastPosition(Gravity.BOTTOM)
	object TOP : ToastPosition(Gravity.TOP)
	object CENTER : ToastPosition(Gravity.CENTER)
}

package com.lesehankoding.simpletoast

import android.content.*
import com.lesehankoding.simpletoast.Class.SimpleToast
import com.lesehankoding.simpletoast.Enum.*

fun warningToast(
	text: String? = "",
	isLongDuration: Boolean = false,
	position: ToastPosition = ToastPosition.BOTTOM,
	showIcon:Boolean = true
) {
	if (isLongDuration) {
		SimpleToast.makeText(
				RegisterToastContext.appContext,
				text,
				SimpleToast.LENGTH_LONG,
				SimpleToast.WARNING,
				showIcon,
				position = position
		).show()
	}else {
		SimpleToast.makeText(
				context = RegisterToastContext.appContext,
				message = text,
				type = SimpleToast.WARNING,
				showIcon = showIcon,
				position = position
		).show()
	}
}

fun String.warningToast(
	text: String? = this,
	isLongDuration: Boolean = false,
	position: ToastPosition = ToastPosition.BOTTOM,
	showIcon:Boolean = true
) {
	if (isLongDuration) {
		SimpleToast.makeText(
				RegisterToastContext.appContext,
				text,
				SimpleToast.LENGTH_LONG,
				SimpleToast.WARNING,
				showIcon,
				position = position
		).show()
	}else {
		SimpleToast.makeText(
				RegisterToastContext.appContext,
				text,
				SimpleToast.LENGTH_SHORT,
				SimpleToast.WARNING,
				showIcon,
				position = position
		).show()
	}
}

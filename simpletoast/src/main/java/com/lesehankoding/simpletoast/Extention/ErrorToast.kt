package com.lesehankoding.simpletoast

import com.lesehankoding.simpletoast.Class.SimpleToast
import com.lesehankoding.simpletoast.Enum.*

fun errorToast(
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
				SimpleToast.ERROR,
				showIcon,
				position = position
		).show()
	}else {
		SimpleToast.makeText(
				context = RegisterToastContext.appContext,
				message = text,
				type = SimpleToast.ERROR,
				showIcon = showIcon,
				position = position
		).show()
	}
}

fun String.errorToast(
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
				SimpleToast.ERROR,
				showIcon,
				position = position
		).show()
	}else {
		SimpleToast.makeText(
				RegisterToastContext.appContext,
				text,
				SimpleToast.LENGTH_SHORT,
				SimpleToast.ERROR,
				showIcon,
				position = position
		).show()
	}
}

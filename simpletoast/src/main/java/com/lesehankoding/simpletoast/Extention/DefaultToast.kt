package com.lesehankoding.simpletoast

import com.lesehankoding.simpletoast.Class.SimpleToast
import com.lesehankoding.simpletoast.Enum.*

//	fun infoToast(
//		context: Context = SimpleToastApp.appContext,
//		text: String,
//		isLongDuration: Boolean = false,
//		position: ToastPosition = ToastPosition.BOTTOM,
//		showIcon: Boolean = true
//	) {
//		if (isLongDuration) {
//			SimpleToast.makeText(
//					SimpleToastApp.appContext,
//					message = text,
//					SimpleToast.LENGTH_LONG,
//					SimpleToast.INFO,
//					showIcon,
//					position = position
//			).show()
//		} else {
//			SimpleToast.makeText(
//					context = SimpleToastApp.appContext,
//					message = text,
//					type = SimpleToast.INFO,
//					showIcon = showIcon,
//					position = position
//			).show()
//		}
//	}
fun infoToast(
	text : String,
	isLongDuration: Boolean = false,
	position: ToastPosition = ToastPosition.BOTTOM,
	showIcon: Boolean = true
) {
	if (isLongDuration) {
		SimpleToast.makeText(
				RegisterToastContext.appContext,
				text,
				SimpleToast.LENGTH_LONG,
				SimpleToast.INFO,
				showIcon,
				position = position
		).show()
	} else {
		SimpleToast.makeText(
				RegisterToastContext.appContext,
				text,
				SimpleToast.LENGTH_SHORT,
				SimpleToast.INFO,
				showIcon,
				position = position
		).show()
	}
}

fun String.infoToast(
	text : String? = this,
	isLongDuration: Boolean = false,
	position: ToastPosition = ToastPosition.BOTTOM,
	showIcon: Boolean = true
) {
	if (isLongDuration) {
		SimpleToast.makeText(
				RegisterToastContext.appContext,
				text,
				SimpleToast.LENGTH_LONG,
				SimpleToast.INFO,
				showIcon,
				position = position
		).show()
	} else {
		SimpleToast.makeText(
				RegisterToastContext.appContext,
				text,
				SimpleToast.LENGTH_SHORT,
				SimpleToast.INFO,
				showIcon,
				position = position
		).show()
	}
}





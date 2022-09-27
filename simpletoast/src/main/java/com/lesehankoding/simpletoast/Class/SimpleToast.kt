package com.lesehankoding.simpletoast.Class

import android.annotation.*
import android.content.*
import android.view.*
import android.widget.*
import androidx.annotation.*
import com.lesehankoding.simpletoast.*
import com.lesehankoding.simpletoast.Enum.*
import java.io.*


internal class SimpleToast(context: Context?) : Toast(context) {

	@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
	@IntDef(SUCCESS, WARNING, ERROR, INFO, DEFAULT)
	annotation class LayoutType

	@IntDef(LENGTH_SHORT, LENGTH_LONG)
	@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
	annotation class Duration


	companion object {
		const val SUCCESS = 1
		const val WARNING = 2
		const val ERROR = 3
		const val INFO = 4
		const val DEFAULT = 5
		const val LENGTH_SHORT = Toast.LENGTH_SHORT
		const val LENGTH_LONG = Toast.LENGTH_LONG

		@SuppressLint("ResourceAsColor")
		fun makeText(
			context: Context?,
			message: String?,
			@Duration duration: Int = LENGTH_SHORT,
			@LayoutType type: Int,
			showIcon: Boolean = true,
			position: ToastPosition = ToastPosition.BOTTOM
		): Toast {

			if (RegisterToastContext.appContext == null){
				throw Throwable("Please RegisterToastContext init in main Apps")
			}

			val toast = Toast(context)
			toast.duration = duration
			toast.setGravity(position.pos,0,80)
			val layout = LayoutInflater.from(context).inflate(R.layout.custom_toast, null, false)
			val txt = layout.findViewById<TextView>(R.id.toast_text)
			val linearLayout = layout.findViewById<LinearLayout>(R.id.toast_type)
			val img = layout.findViewById<ImageView>(R.id.toast_icon)
			txt.text = message
			if (showIcon) img.visibility = View.VISIBLE else img.visibility = View.GONE
			when (type) {
				1 -> {
					linearLayout.setBackgroundResource(R.drawable.shape_toast_success)
					img.setImageResource(R.drawable.ic_toast_close_success)
				}
				2 -> {
					linearLayout.setBackgroundResource(R.drawable.shape_toast_warning)
					img.setImageResource(R.drawable.ic_toast_close_warning)
					txt.setTextColor(R.color.color_toast_text_black)
				}
				3 -> {
					linearLayout.setBackgroundResource(R.drawable.shape_toast_error)
					img.setImageResource(R.drawable.ic_toast_close_error)
				}
				4 -> {
					linearLayout.setBackgroundResource(R.drawable.shape_toast_info)
					img.setImageResource(R.drawable.ic_toast_close_info)

				}
				5 -> {
					linearLayout.setBackgroundResource(R.drawable.shape_toast_default)
					img.visibility = View.GONE
				}
			}
			toast.view = layout
			return toast
		}
	}
}


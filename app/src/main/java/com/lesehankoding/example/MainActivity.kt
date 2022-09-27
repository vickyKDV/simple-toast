package com.lesehankoding.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.*
import com.lesehankoding.simpletoast.*
import com.lesehankoding.simpletoast.Enum.*

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		/**
		 * Example String Extention
		 * Position DEFAULT / BOTTOM
		 * Type Info Toast
		 **/
		findViewById<Button>(R.id.btnBottom).setOnClickListener {
			"Info Bottom / Default".infoToast()
		}

		/**
		 * Example String Parameter
		 * Position CENTER
		 * Type Info Toast
		 **/
		findViewById<Button>(R.id.btnCenter).setOnClickListener {
			infoToast("Info Center",position = ToastPosition.CENTER)
		}

		/**
		 * Example String Extention
		 * Position TOP
		 * Type Info Toast
		 **/
		findViewById<Button>(R.id.btnTop).setOnClickListener {
			"Info Top".infoToast(position = ToastPosition.TOP)
		}

		/**
		 * Example String Parameter
		 * Position TOP
		 * Type Error Toast
		 **/
		findViewById<Button>(R.id.btnErroraToast).setOnClickListener {
			errorToast("Error", position = ToastPosition.TOP)
		}


		/**
		 * Example String Extention
		 * Position TOP
		 * Type Warning Toast
		 **/
		findViewById<Button>(R.id.btnWarningToast).setOnClickListener {
			"Warning".warningToast(position = ToastPosition.TOP)
		}


		/**
		 * Example String Extention
		 * Position TOP
		 * Type Warning Toast
		 **/
		findViewById<Button>(R.id.btnSuccessToast).setOnClickListener {
			"Success".successToast(position = ToastPosition.TOP)
		}
	}
}
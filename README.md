# 📸 SIMPLE TOAST

[![Download](https://jitpack.io/v/vickyKDV/simple-toast.svg)](https://jitpack.io/#vickyKDV/simple-toast)
[![API](https://img.shields.io/badge/API-19%2B-brightgreen.svg?style=social)](https://android-arsenal.com/api?level=19)
![Language](https://img.shields.io/badge/language-Kotlin-orange.svg)
[![ktlint](https://img.shields.io/badge/code%20style-%E2%9D%A4-FF4081.svg)](https://ktlint.github.io/)
[![PRWelcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](https://github.com/vickykdv/simple-toast)
[![Open Source Love](https://badges.frapsoft.com/os/v1/open-source.svg?v=102)](https://opensource.org/licenses/Apache-2.0)


# 💻Usage


1. Gradle dependency:

   ```groovy
   allprojects {
      repositories {
              maven { url "https://jitpack.io" }
      }
   }
   ```

   **If you are yet to Migrate on AndroidX, Use support build artifact:**
   ```groovy
   implementation 'com.github.vickykdv:simple-toast:TAG'
    ```

# 🎨Simpe Usage

   ```kotlin
   class MyApp:Application() {
      override fun onCreate() {
         super.onCreate()
         
         //Init This Line
         RegisterToastContext.appContext = this
      }
   }
   ```

   ```kotlin
   /**
    * Example String Extention
    * Position DEFAULT / BOTTOM
    * Type Info Toast
    **/
   findViewById<Button>(R.id.btnBottom).setOnClickListener {
      "Info Bottom / Default".infoToast()
   }
   ```
   ```kotlin   
   /**
    * Example String Parameter
    * Position CENTER
    * Type Info Toast
    **/
   findViewById<Button>(R.id.btnCenter).setOnClickListener {
      infoToast("Info Center",position = ToastPosition.CENTER)
   }
   ```

   ```kotlin
   /**
    * Example String Extention
    * Position TOP
    * Type Info Toast
    **/
   findViewById<Button>(R.id.btnTop).setOnClickListener {
      "Info Top".infoToast(position = ToastPosition.TOP)
   }
   ```

   ```kotlin
   /**
    * Example String Parameter
    * Position TOP
    * Type Error Toast
    **/
   findViewById<Button>(R.id.btnErroraToast).setOnClickListener {
      errorToast("Error", position = ToastPosition.TOP)
   }
   ```

   ```kotlin   
   /**
    * Example String Extention
    * Position TOP
    * Type Warning Toast
    **/
   findViewById<Button>(R.id.btnWarningToast).setOnClickListener {
      "Warning".warningToast(position = ToastPosition.TOP)
   }
   ```

   ```kotlin   
   /**
    * Example String Extention
    * Position TOP
    * Type Warning Toast
    **/
   findViewById<Button>(R.id.btnSuccessToast).setOnClickListener {
      "Success".successToast(position = ToastPosition.TOP)
   }
   ```
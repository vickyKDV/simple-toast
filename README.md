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


### Let us know!
We'll be really happy if you sent us links to your projects where you use our component. Just send an email to **vickykdv@gmail.com** And do let us know if you have any questions or suggestion regarding the library.

## License

    Copyright 2019-2022, Vicky KDV

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
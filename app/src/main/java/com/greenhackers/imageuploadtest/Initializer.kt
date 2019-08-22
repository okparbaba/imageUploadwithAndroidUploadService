package com.greenhackers.imageuploadtest

import android.app.Application
import net.gotev.uploadservice.UploadService

class Initializer : Application() {

    override fun onCreate() {
        super.onCreate()
        // setup the broadcast action namespace string which will
        // be used to notify upload status.
        // Gradle automatically generates proper variable as below.
        UploadService.NAMESPACE = BuildConfig.APPLICATION_ID
        // Or, you can define it manually.
        UploadService.NAMESPACE = "com.greenhackers.imageuploadtest"
    }
}
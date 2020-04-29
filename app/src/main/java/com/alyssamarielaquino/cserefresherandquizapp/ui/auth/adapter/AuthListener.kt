package com.alyssamarielaquino.cserefresherandquizapp.ui.auth.adapter

import androidx.lifecycle.LiveData

interface AuthListener {

    fun onStarted()
    fun onSuccess(loginResponse: LiveData<String>)
    fun onFailure(message: String)



}
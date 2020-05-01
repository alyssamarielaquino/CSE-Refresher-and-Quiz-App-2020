package com.alyssamarielaquino.cserefresherandquizapp.ui.auth.adapter

import com.alyssamarielaquino.cserefresherandquizapp.data.model.User

interface AuthListener {

    fun onStarted()
    fun onSuccess(user : User)
    fun onFailure(message: String)



}
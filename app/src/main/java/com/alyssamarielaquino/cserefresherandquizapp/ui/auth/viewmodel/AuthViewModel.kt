package com.alyssamarielaquino.cserefresherandquizapp.ui.auth.viewmodel

import android.view.View
import androidx.lifecycle.ViewModel
import com.alyssamarielaquino.cserefresherandquizapp.data.repository.UserRepository
import com.alyssamarielaquino.cserefresherandquizapp.ui.auth.adapter.AuthListener

class AuthViewModel : ViewModel() {

    var email : String? = null
    var password: String? = null

    var authListener : AuthListener? = null

    fun onLoginButtonClick(view : View){

        authListener?.onStarted()

        if (email.isNullOrEmpty() || password.isNullOrEmpty()){
            authListener?.onFailure("Invalid email or password")
            return
        }

        val loginResponse = UserRepository().userLogin(email!!, password!!)
        authListener?.onSuccess(loginResponse)


    }

    fun onRegisterButtonClick(view : View){

        if (email.isNullOrEmpty() || password.isNullOrEmpty()){
            authListener?.onStarted()

            if (email.isNullOrEmpty() || password.isNullOrEmpty()){
                authListener?.onFailure("Invalid email or password")
                return
            }

            val loginResponse = UserRepository().userLogin(email!!, password!!)
            authListener?.onSuccess(loginResponse)
        }


    }

}
package com.alyssamarielaquino.cserefresherandquizapp.ui.auth.viewmodel

import android.view.View
import androidx.lifecycle.ViewModel
import com.alyssamarielaquino.cserefresherandquizapp.data.repository.UserRepository
import com.alyssamarielaquino.cserefresherandquizapp.ui.auth.adapter.AuthListener
import com.alyssamarielaquino.cserefresherandquizapp.util.Coroutines

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

        Coroutines.main {
            val response = UserRepository().userLogin(email!!, password!!)
            if (response.isSuccessful){
                authListener?.onSuccess(response.body()?.user!!)
            }
        }





    }

    fun onRegisterButtonClick(view : View){

        authListener?.onStarted()

        if (email.isNullOrEmpty() || password.isNullOrEmpty()){
            authListener?.onFailure("Invalid email or password")
            return
        }

        Coroutines.main {
            val response = UserRepository().userLogin(email!!, password!!)
            if (response.isSuccessful){
                authListener?.onSuccess(response.body()?.user!!)
            }
            else{
                authListener?.onFailure("Error code: ${response.code()}")
            }
        }


    }

}
package com.alyssamarielaquino.cserefresherandquizapp.ui.auth.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import com.alyssamarielaquino.cserefresherandquizapp.R
import com.alyssamarielaquino.cserefresherandquizapp.data.model.User
import com.alyssamarielaquino.cserefresherandquizapp.databinding.ActivityLoginBinding
import com.alyssamarielaquino.cserefresherandquizapp.ui.auth.adapter.AuthListener
import com.alyssamarielaquino.cserefresherandquizapp.ui.auth.viewmodel.AuthViewModel
import com.alyssamarielaquino.cserefresherandquizapp.ui.home.view.HomeActivity
import com.alyssamarielaquino.cserefresherandquizapp.util.toast

class LoginActivity : AppCompatActivity(), AuthListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val binding : ActivityLoginBinding = DataBindingUtil.setContentView(this,R.layout.activity_login )
        val viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)

        binding.viewmodel = viewModel
        viewModel.authListener = this


    }

    override fun onStarted() {
        toast("Login Started")
    }

    override fun onSuccess(user: User) {
        Intent(applicationContext, HomeActivity::class.java).also{
            startActivity(it)
        }
    }

    override fun onFailure(message: String) {
        toast(message)
    }


}

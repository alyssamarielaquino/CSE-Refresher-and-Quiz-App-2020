package com.alyssamarielaquino.cserefresherandquizapp.ui.auth.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.alyssamarielaquino.cserefresherandquizapp.R
import com.alyssamarielaquino.cserefresherandquizapp.data.model.User
import com.alyssamarielaquino.cserefresherandquizapp.databinding.ActivityRegisterBinding
import com.alyssamarielaquino.cserefresherandquizapp.ui.auth.adapter.AuthListener
import com.alyssamarielaquino.cserefresherandquizapp.ui.auth.viewmodel.AuthViewModel
import com.alyssamarielaquino.cserefresherandquizapp.util.toast


class RegisterActivity : AppCompatActivity(), AuthListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityRegisterBinding = DataBindingUtil.setContentView(this,R.layout.activity_register )
        val viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)

        binding.viewmodel = viewModel
        viewModel.authListener = this

    }


    override fun onStarted() {
        toast("Login Started")
    }

    override fun onSuccess(user: User) {
        toast("${user.name} is logged in.")
    }

    override fun onFailure(message: String) {
        toast(message)
    }


}

package com.alyssamarielaquino.cserefresherandquizapp.data.api

import com.alyssamarielaquino.cserefresherandquizapp.data.model.User

data class AuthResponse (

    val isSuccessful : Boolean?,
    val message : String?,
    val user : User?

)
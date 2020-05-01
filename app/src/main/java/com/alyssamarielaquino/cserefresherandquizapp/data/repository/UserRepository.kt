package com.alyssamarielaquino.cserefresherandquizapp.data.repository

import com.alyssamarielaquino.cserefresherandquizapp.data.api.AuthResponse
import com.alyssamarielaquino.cserefresherandquizapp.data.api.MyApi
import retrofit2.Response

class UserRepository {

    suspend fun userLogin(email: String, password: String) : Response<AuthResponse> {
       return MyApi().userLogin(email, password)
    }

}
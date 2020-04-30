package com.alyssamarielaquino.cserefresherandquizapp.data.model

import androidx.room.Entity

const val CURRENT_USER_ID = 0


@Entity
data class User (
    val id : Int? = null,
    val name : String? = null,
    val email : String? = null,
    val password: String? = null,
    val created_at : String? = null,
    val updated_at : String? = null
){
    
}

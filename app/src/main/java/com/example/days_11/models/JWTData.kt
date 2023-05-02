package com.example.days_11.models

import android.provider.ContactsContract.CommonDataKinds.Email

data class JWTData(
    val id : Long,
    val username : String,
    val email: String,
    val firstname : String,
    val lastname : String,
    val gender : String,
    val image: String,
    val token : String
)

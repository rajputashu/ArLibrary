package com.ar.emailvalidator

/**
 * Created by Ashu Rajput on 23-02-2022
 */
class EmailValidator {
    fun isEmailId(email: String): Boolean {
        return email.isNotEmpty()
    }
}
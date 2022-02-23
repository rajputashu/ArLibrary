package com.ar.emailvalidator

/**
 * Created by Ashu Rajput on 23-02-2022
 */
class FieldValidator {
    fun isFieldOk(fieldName: String): Boolean {
        return fieldName.isNotBlank()
    }
}
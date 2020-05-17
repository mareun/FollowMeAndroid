package com.ghdev.followme.ui

import androidx.lifecycle.LiveData

interface LoginListener {
    fun onSuccess(loginResponse: LiveData<String>)
    fun onFailure(message: String)
}
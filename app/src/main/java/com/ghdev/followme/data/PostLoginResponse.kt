package com.ghdev.followme.data

data class PostLoginResponse (
    val accessToken: String,
    val refreshToken: String,
    val message: String
)
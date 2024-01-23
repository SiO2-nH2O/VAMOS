package com.example.mannardongi

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
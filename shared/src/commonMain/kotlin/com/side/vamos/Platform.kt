package com.side.vamos

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
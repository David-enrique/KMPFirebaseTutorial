package com.davidhl.kmpfirebasetutorial

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
package com.rarnu.kid

import kotlin.random.Random

val CHARS = "01234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
val SIZE = CHARS.length

fun main() {
    println(arrayOf(3, 2, 3).joinToString("-") { 0.until(it).map { CHARS[Random.nextInt(0, SIZE - 1)] }.joinToString("") })
}

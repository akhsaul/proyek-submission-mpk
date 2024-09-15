package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int) = str.filter { it.isDigit() }.let {
    if (it.isNotEmpty()) {
        str.replace(it, (it.toInt() * int).toString())
    } else {
        str + int
    }
}

package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int) = number.toString().let {
    it.min().digitToInt().plus(it.max().digitToInt())
}

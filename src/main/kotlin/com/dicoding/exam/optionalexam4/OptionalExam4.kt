package com.dicoding.exam.optionalexam4

// TODO
fun getMiddleCharacters(string: String) = if (string.length % 2 == 0) {
    string.slice((string.length / 2) - 1..string.length / 2)
} else {
    string[string.length / 2].toString()
}

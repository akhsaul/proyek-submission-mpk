/****************************************************************************************************
 *                               Perhatian                                                          *
 *                                                                                                  *
 *          Agar dapat diperiksa dengan baik, hindari beberapa hal berikut:                         *
 *                                                                                                  *
 *          1. Mengubah nama concatString                                                 *
 *          2. Mengubah struktur project (menghapus, mengedit, dan memindahkan package)             *
 *                                                                                                  *
 ***************************************************************************************************/

package com.dicoding.exam.latihanopsional2

import java.io.File
import java.nio.file.Files

/**
 *  TODO
 *  Ubahlah fungsi concatString() menjadi sebuah lambad expression yang dapat menggabungkan dua buah string.
 *  Dengan syarat sebagai berikut:
 *   - Tidak boleh menggunakan keyword `fun`
 *   - Tidak boleh mengandung karakter `{` dan `}`
 *
 *  Contoh:
 *  Input : concatString("Hello", "Dicoding") -> Output = HelloDicoding
 *
 *  Modul terkait: Kotlin Fundamental & Functional Programming
 */

fun main() {
    println(concatString("Hello", "Dicoding") == "HelloDicoding")
    println(concatString("", "Dicoding") == "Dicoding")
    println(concatString("Dicoding ", "Indonesia") == "Dicoding Indonesia")
}

/**
 * SILAKAN UBAH FILE INI DARI HANYA DARI LINE 40 SAMPAI BAWAH.
 * Pastikan tidak menggandung keyword 'fun' dan karakter '{' & '}
 * Pastikan tidak mengubah nama 'concatString'
 */

fun concatString(string1: String, string2: String): String {
    return ""
}

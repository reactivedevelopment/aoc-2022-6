package com.adventofcode

fun solve(line: String): Int {
  val codeSize = 14
  val code = line.windowed(codeSize, 1).map(String::toSet).first { it.size == codeSize}.joinToString("")
  return line.indexOf(code) + codeSize
}

fun main() {
  ::main.javaClass
    .getResourceAsStream("/input")!!
    .bufferedReader()
    .readText()
    .let(::solve)
    .let(::println)
}
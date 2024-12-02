package ru.sergey

import java.io.File
import java.io.InputStream

fun main() {
    val DPMA = redFileToDPMA()
    val chain = "aaabbbcc"
    val startState = "q0"
    val rez = VerificationDPMA.isPrenadlezhit(startState, chain, DPMA)
    println(rez)
}
fun redFileToDPMA() : List<State> {
    val DPMA = mutableListOf<State>()
    val inputStream: InputStream = File("C:/Users/serzh/IdeaProjects/tiap4/src/main/kotlin/i1.txt").inputStream()

    inputStream
        .bufferedReader()
        .forEachLine {
            DPMA.add(State(it))
        }
    return DPMA
}

package ru.sergey

class State {
    var name: String = "f"
    var symbol: String = ""
    var stack: String = ""
    var nameNextState = "f"
    var nextSymbolStack = ""
    var cainSymbol = ""

    constructor(input: String) {
        // Разделим строку сначала по символу '='
        val parts = input.split("=")

        // Получим части слева от '=' и справа от '='
        val leftPart = parts[0].split(",").map {
            if (it == "l") ""
            else it
        } // p1, p2, p3
        val rightPart = parts[1].split(",").map {
            if (it == "l") ""
            else it
        } // p4, p5, p6

        // Присвоим значения переменным
        val (p1, p2, p3) = leftPart
        val (p4, p5, p6) = rightPart

         name = p1
         symbol = p2
         stack = p3
         nameNextState = p4
         nextSymbolStack = p5
         cainSymbol = p6
    }
}

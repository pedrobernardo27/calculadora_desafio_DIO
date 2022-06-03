package main.kotlin

fun main() {
    calcular()

}

fun calcular() {
    println("Informe o primeiro número: ")
    val n1 = readLine()?.toInt()
    println("Informe a operação: ")
    val operacao = readLine()
    println("Informe o segundo número: ")
    val n2 = readLine()?.toInt()
    if (operacao == "+") {
        val soma = n1!! + n2!!
        println("O total da soma é de $soma")
    } else if (operacao == "-") {
        val subtracao = n1!! - n2!!
        println("O total da subtração é $subtracao")
    } else if (operacao == "*") {
        val multiplicacao = n1!! * n2!!
        println("O total da multiplicação é $multiplicacao")
    } else if (operacao == "/") {
        val divisao = n1!! / n2!!
        println("O total da divisão é $divisao")
    }

}










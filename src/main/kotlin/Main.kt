package main.kotlin

fun main() {
    calcular()

}

fun calcular() {
    var n1: Int? = null
    var n2: Int? = null
    var operacao: String? = null
    do {
        println("Informe o primeiro número: ")
        val retorno = readLine()
        if (retorno != null && retorno != "") {
            n1 = retorno.toIntOrNull()
        } else {
            println("Valor inválido.")
        }
    } while (n1 == null)
    do {
        println("Informe a operação: ")
        val retorno = readLine()
        if (retorno != null && retorno != "") {
            if (retorno == "+" || retorno == "-" || retorno == "*" || retorno == "/") {
                operacao = retorno
            } else {
                println("Operação inválida.")
            }
        }else{
            println("Valor inválido.")
        }
    } while (operacao == null)
    do{
        println("Informe o segundo número: ")
        val retorno = readLine()
        if (retorno != null && retorno != "") {
            n2 = retorno.toIntOrNull()
        } else {
            println("Valor inválido.")
        }
    }while (n2 == null)
    if (operacao == "+") {
        val soma = n1 + n2
        println("O total da soma é de $soma")
    } else if (operacao == "-") {
        val subtracao = n1 - n2
        println("O total da subtração é $subtracao")
    } else if (operacao == "*") {
        val multiplicacao = n1 * n2
        println("O total da multiplicação é $multiplicacao")
    } else if (operacao == "/") {
        val divisao = n1 / n2
        println("O total da divisão é $divisao")
    }


}














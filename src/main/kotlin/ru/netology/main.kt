package ru.netology


fun main() {
    val taxSize: Double = 0.0075
    val minTax: Int = 3500
    val amount: Int = 1000000
    val result = if (amount * taxSize > minTax) amount * taxSize else minTax
    println(result)
}
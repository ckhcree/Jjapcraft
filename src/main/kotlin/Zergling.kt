package org.example

class Zergling {
    val style: String = "cheongsun"
    var height: Int = 160
    var weight: Int = 90
    var wallet: Int = 900

    fun move() {
//swim
    }

    fun attack(): Int {
        return weight + 10
    }

    fun takeattack(): Int {
        return height - 15
    }

    fun eat(food: String) {
//kimchi
    }

    fun jaetekeu(money: String): Int {
//bitcoin
        return wallet + 200
    }

    fun info() {
        println("나는 ${style}한 편이다")
        println("내 키는 ${height}")
        println("내 무게는 ${weight}")
        println("내 전재산 ${wallet}원")
    }
}
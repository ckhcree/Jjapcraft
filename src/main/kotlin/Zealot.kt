package org.example

class Zealot() {
    val style: String = "pretty"
    var height: Int = 215
    var weight: Int = 40
    var wallet: Int = 500

    fun move() {
//fly
    }

    fun attack(): Int {
        return weight + 10
    }

    fun takeattack(): Int {
        return height - 15
    }

    fun eat(food: String) {
//cucumber
    }

    fun jaetekeu(money: String): Int {
//gold
        return wallet + 200
    }

    fun info() {
        println("나는 ${style}한 편이다")
        println("내 키는 ${height}")
        println("내 무게는 ${weight}")
        println("내 전재산 ${wallet}원")
    }
}
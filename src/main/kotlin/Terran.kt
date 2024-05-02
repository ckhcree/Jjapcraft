package org.example

class Terran {
    val style: String = "cute"
    var height: Int = 180
    var weight: Int = 60
    val wallet: Int = 200

    fun move() {
//run
    }

    fun attack(): Int {
        return weight + 10
    }

    fun takeattack(): Int {
        return height - 15
    }

    fun eat(food: String) {
//kkagdugi
    }

    fun jaetekeu(money: String): Int {
//mineral
        return wallet + 200
    }

    fun info() {
        println("나는 ${style}한 편이다")
        println("내 키는 ${height}")
        println("내 무게는 ${weight}")
        println("내 전재산 ${wallet}원")
    }
}
package org.example

fun main() {
    var zealot = Zealot()
    var terran = Terran()
    var zergling = Zergling()

    zealot.info()
    println("여기까지 질럿 자기소개")

    zealot.move()
        println("zealot can fly")

    println("공격하면 무게 십 쪄서 ${zealot.attack()}")
    println("공격받으면 키가 십오 줄어서 ${zealot.takeattack()}")

    zealot.eat("cucumber")
    println("YumYum good")

    println("금투자로 이백원 벌어서 ${zealot.jaetekeu("gold")}")

    println("질럿 변동사항 끝")


    terran.info()
    println("여기까지 테란 자기소개")

    terran.move()
    println("terran is running")

    println("공격하면 무게 십 쪄서 ${terran.attack()}")
    println("공격받으면 키가 십오 줄어서 ${terran.takeattack()}")

    terran.eat("kkagdugi")
    println("YumYum good")

    println("미네랄로 오십원 벌어서 ${terran.jaetekeu("mineral")}")

    println("테란 변동사항 끝")


    zergling.info()
    println("여기까지 저글링 자기소개")

    zergling.move()
    println("zergling likes to swim")

    println("공격하면 무게 십 쪄서 ${zergling.attack()}")
    println("공격받으면 키가 십오 줄어서 ${zergling.takeattack()}")

    zergling.eat("kimchi")
    println("YumYum good")

    println("비트코인 대박나서 ${zergling.jaetekeu("mineral")}")

    println("저글링 변동사항 끝")
}
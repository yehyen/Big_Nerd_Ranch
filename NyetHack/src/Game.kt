fun main(args: Array<String>) {
    val name = "Madrigal"
    // 顯示玩家健康狀況
    var healthPoints = 89
    // 看看走不走運
    val isBlessed = true
    // 頭上是否有光環：走運且健康值>50
    val isImmortal = false

    // 邏輯運算子優先順序：[!], [<,<=,>,>=], [==,!=], [&&], [||]
    if(isBlessed && healthPoints > 50 || isImmortal){
        println("GREEN")
    }else{
        println("NONE")
    }

    if(healthPoints == 100){
        println(name + " is in excellent condition!")
    }else if(healthPoints >= 90){
        println(name + " has a few scratches.")
    }else if(healthPoints >= 75){
        // 巢狀if...else
        if(isBlessed){
            println(name + " has some minor wounds but is healing quite quickly!")
        }else{
            println(name + " has some minor wounds.")
        }
    }else if(healthPoints >= 15){
        println(name + " looks pretty hurt.")
    }else{
        println(name + " is in awful condition!")
    }
}
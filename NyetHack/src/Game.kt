fun main(args: Array<String>) {
    val name = "Madrigal"
    // 顯示玩家健康狀況
    var healthPoints = 89
    // 看看走不走運
    val isBlessed = true
    // 頭上是否有光環
    val isImmortal = false

    // 光環出現條件：走運且健康值>50
    // 邏輯運算子優先順序：[!], [<,<=,>,>=], [==,!=], [&&], [||]
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    if(auraVisible){
        println("GREEN")
    }else{
        println("NONE")
    }

    //  判斷玩家狀況
    val healthStatus = if(healthPoints == 100){
        " is in excellent condition!"
    }else if(healthPoints >= 90){
        " has a few scratches."
    }else if(healthPoints >= 75){
        // 巢狀if...else
        if(isBlessed){
            " has some minor wounds but is healing quite quickly!"
        }else{
            " has some minor wounds."
        }
    }else if(healthPoints >= 15){
        " looks pretty hurt."
    }else{
        " is in awful condition!"
    }
    println(name + " " + healthStatus)
}
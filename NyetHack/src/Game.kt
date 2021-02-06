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
    // 光環顏色判斷，單行條件更簡潔重構
    val auraColor = if(auraVisible) "GREEN" else "NONE"
    println(auraColor)


    //  判斷玩家狀況，改用range重構指定範圍，可解決條件句需要排序的問題
    val healthStatus = if(healthPoints == 100){
        "is in excellent condition!"
    }else if(healthPoints in 90..99){
        "has a few scratches."
    }else if(healthPoints in 75..89){
        // 巢狀if...else
        if(isBlessed){
            "has some minor wounds but is healing quite quickly!"
        }else{
            "has some minor wounds."
        }
    }else if(healthPoints in 15..74){
        "looks pretty hurt."
    }else{
        "is in awful condition!"
    }
    println(name + " " + healthStatus)
}
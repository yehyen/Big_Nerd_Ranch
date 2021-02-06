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

    // 判斷玩家狀況
    // 用when改寫，比對when小括號中的引數==大括弧中->運算子左邊條件
    // 條件句若有else if分支，都建議改用when寫
    val healthStatus = when(healthPoints){
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if(isBlessed){
            "has some minor wounds but is healing quite quickly!"
        }else{
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }

    // $符號可在字串中用${}計算運算式的值，其結果會被插入字串
    println("(Aura: $auraColor) " +
            "(Blessed: ${if(isBlessed) "YES" else "NO"})")

    // $符號可使變數插入字串中
    println("$name $healthStatus")
}
fun main(args: Array<String>) {
    val name = "Madrigal"
    // 顯示玩家健康狀況
    var healthPoints = 89
    // 看看走不走運
    val isBlessed = true
    // 頭上是否有光環
    val isImmortal = false

    // 光環出現條件：走運且健康值>50
    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)

    // 判斷玩家狀況
    val healthStatus = formatHealthStatus(healthPoints, isBlessed)

    // 顯示玩家狀況
    printPlayerStatus(auraColor, isBlessed, name, healthStatus)

    // 施展Fireball魔法功能
    castFireball()
}

// 使用Refactor→function..重構
private fun printPlayerStatus(auraColor: String, isBlessed: Boolean, name: String, healthStatus: String) {
    println("(Aura: $auraColor) " +
            "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")
}

// 使用Refactor→function..重構
private fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean): String {
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"
    return auraColor
}

// 單運算式函數：若函數內只有一個運算式求值，或只有一行求值語句，返回、大括弧都可以省略，直接以「=」代替
private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) =
    when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds, but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }


// 自訂函數Fireball功能，輸出施展魔法的結果，增加參數讓玩家一次多變出幾杯來，不代引數傳入，參數預設即為2
private fun castFireball(numFireballs: Int = 2){
    println("A glass of Fireball springs into existence. (x$numFireballs)")
}
fun main(args: Array<String>) {

    // 知道小鎮發展狀況：傳入兩個參數playerName與numBuildings，超過1個引數無法使用it
    // 一般變數定義：val greetingFunction: String = ... 表示greetingFunction儲存的是哪種類型的資料
    // 一般函數定義：fun greetingFunction(): String{}
    // 匿名函數類型的變數定義：val greetingFunction: () -> String = ...表示greetingFunction儲存的是哪種類型的函數
    // 如上() -> String，()的參數，返回資料類型為String
    // 不用註明return，匿名函數會自動回傳函數中最後一行
    // ()內放匿名函數的參數類型，playerName為()的參數名稱
    // 只有一個參數的匿名函數，可使用it代替參數名稱或具名引數
    // 類型推斷特性可簡略定義類型，讓greetingFunction函數自行去推斷，但參數必須要有名稱和類型定義，否則程式混洧
    val greetingFunction = { playerName: String, numBuildings: Int ->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        "Welcom to SimVillage, $playerName! (copyright $currentYear)"
    }

    // 隨機確定已建造多少棟房子後，輸出歡迎語句
    runSimulation("Guyal", greetingFunction)
}

fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..3).shuffled().last()
    println(greetingFunction(playerName, numBuildings))
}

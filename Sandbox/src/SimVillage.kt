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
    // 直接呼叫使用函數簡略語法：當函數的lambda運算式參數是唯一的或是排在最後的，便可省略引數小括號
    // 使用函數參照printConstructionCost需用::運算子+待引用函數名稱，呼叫runSimulation()但參數2引用printConstructionCost
    runSimulation("Guyal", ::printConstructionCost){ playerName, numBuildings ->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        "Welcom to SimVillage, $playerName! (copyright $currentYear)"
    }
}

// lambda是以物件形式存在，會把lambda有相關的變數分配給記憶體影響效能
// 使用inline關鍵字，呼叫函數時就不會使用lambda物件
// 參數2來源參照printConstructionCost函數
inline fun runSimulation(playerName: String, costPrinter: (Int) -> Unit, greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..3).shuffled().last()     // 房屋數
    costPrinter(numBuildings)
    println(greetingFunction(playerName, numBuildings))
}

// 房屋建造成本，runSimulation的函數參照costPrinter
fun printConstructionCost(numBuildings: Int){
    val cost = 500
    println("construction cost: ${cost * numBuildings}")
}

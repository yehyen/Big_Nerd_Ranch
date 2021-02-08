fun main(args: Array<String>) {

    // 輸入歡迎語向新鎮長致敬，匿名函數當作變數值指派給函數類型的變數
    // 一般變數定義：val greetingFunction: String = ... 表示greetingFunction儲存的是哪種類型的資料
    // 一般函數定義：fun greetingFunction(): String{}
    // 匿名函數類型的變數定義：val greetingFunction: () -> String = ...表示greetingFunction儲存的是哪種類型的函數
    // 如上() -> String，()的參數，返回資料類型為String
    // 不用註明return，匿名函數會自動回傳函數中最後一行
    // ()內放匿名函數的參數類型，playerName為()的參數名稱
    val greetingFunction: (String) -> String = { playerName ->
        val currentYear = 2018
        "Welcom to SimVillage, $playerName! (copyright $currentYear)"
    }
    println(greetingFunction("Guyal"))
}
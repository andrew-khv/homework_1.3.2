fun calComission (card: String, lastTransfers: Double = 0.0, transfer: Double): Double {
    when (card) {
        "Maestro", "Mastercard" -> {
            if(lastTransfers+transfer > 7500000) return transfer*0.0075+2000
            return 0.0
        }
        "Visa", "Мир" -> return transfer*0.0075
        else -> return 0.0
    }
}
fun main() {
    val amount = 10000000.0
    val card = "Mastercard"
    var lastTransfers = 50000.0
    if(amount < 3500 && (card == "Visa" || card == "Мир")) {
        println("Неподдерживаемая сумма платежа")
        return
    }
    val totalAmount = (calComission(card, lastTransfers, amount) + amount)/100
        println("Сумма к оплате $totalAmount руб")
    }
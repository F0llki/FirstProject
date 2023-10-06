fun main() {
    var balance: Int = 80 //Баланс корпоративной карты
    println("Меню")
    println("1 Кофе - цена 100 ")
    println("2 Чай - цена 85")
    println("3 Лимонад - цена 65")
    println("4 Вода - цена 50")
    println("Выберите номер напитка")
    val yourChoice = readln()!!.toInt()

    when (yourChoice) {
        1 -> if (balance > 100) {
            balance -= 100
            println(("Вы выбрали Кофе. Остаток на карте: ") + balance)
        } else {
            println("Недостаточно средств.")
        }

        2 -> if (balance > 85) {
            balance -= 85
            println(("Вы выбрали Кофе. Остаток на карте: ") + balance)
        } else {
            println("Недостаточно средств.")
        }

        3 -> if (balance > 65) {
            balance -= 65
            println(("Вы выбрали Кофе. Остаток на карте: ") + balance)
        } else {
            println("Недостаточно средств.")
        }

        4 -> if (balance > 50) {
            balance -= 50
            println(("Вы выбрали Кофе. Остаток на карте: ") + balance)
        } else {
            println("Недостаточно средств.")
        }
    }
}
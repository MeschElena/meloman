fun main() {
    val amount = 1000
    val amountPrev = 20000
    val thisMeloman = true

    val amountDiscount = if (amountPrev <= 1000){
        amount.toDouble()
    }
    else if (amountPrev <= 10000){
        (amount - 100).toDouble()
    }
    else {
        amount * 0.95
    }

    val check = if (thisMeloman) {
        amountDiscount * 0.99
    } else {
        amountDiscount
    }
    println("Сумма вашей покупки с учетом скидок составила $check")
}
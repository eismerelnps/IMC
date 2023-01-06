import kotlin.math.pow

var IMC: Double = 0.0
var weight: Double = 0.0
var high: Double = 0.0

fun main() {
    fillDatas()
    calculateIMC()
    checkValue()
}
    fun fillDatas(){
        var pass: Boolean
        do {
            print("Type your Weight: ")
            val test: Double? = readLine()?.toDouble()
            if (test!! < 1){
                println("Type a valid weight major than 0")
                pass = false
            }else {
                weight = test

                pass = true
            }
        }while (!pass)

        do {
            print("Type your High: ")
            val test  = readLine()?.toFloat()!!
            if (test < 1){
                println("Type a valid high major than 0")
                pass = false
            }else {
                high = test.toDouble()
                pass = true
            }
        }while (!pass)

    }
    fun  calculateIMC(){
    IMC = weight/ high.pow(2.0)
    println("IMC is $IMC")
}
    fun checkValue(){
    when(IMC){
        in 0.0..16.0 -> println("Severe thickness")
        in 16.1..17.0 -> println("Moderate thickness")
        in 17.1..18.5 -> println("Thickness")
        in 18.6..25.0 -> println("Normal weight")
        in 25.1..30.0 -> println("Overweight")
        in 30.1..35.0 -> println("Obvesidad leve")
        in 35.1..40.0 -> println("Moderate Obesidad")
        in 40.1..1000.0 -> println("Obesidad morbida")
        else -> println("Invalid dates")


    }
}

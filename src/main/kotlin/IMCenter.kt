import javax.swing.JOptionPane
import kotlin.math.pow

class IMCenter {
    var IMC: Double = 0.0


    fun  calculateIMC(weight: Double, height:Double): Double {
        IMC = weight/ height.pow(2.0)
        return IMC
    }
    fun Value(): String? {
        return when(IMC){
            in 0.0..16.0 -> return "Severe thickness"
            in 16.1..17.0 -> return "Moderate thickness"
            in 17.1..18.5 -> return "Thickness"
            in 18.6..25.0 -> return "Normal weight"
            in 25.1..30.0 -> return "Overweight"
            in 30.1..35.0 -> return "Obvesidad leve"
            in 35.1..40.0 -> return "Moderate Obesidad"
            in 40.1..1000.0 -> return "Obesidad morbida"
            else -> "ERROR"
        }
    }
}
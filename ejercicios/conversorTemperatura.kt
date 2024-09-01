fun main() 
{
    printFinalTemperature(initialMeasurement = 26.0, initialUnit ="Celsius", finalUnit ="Fahrenheit",
     conversionFormula ={C -> 9/5 * C + 32}) 

+
     //De Kelvin a Celsius
     printFinalTemperature(initialMeasurement=26.0, initialUnit="Kelvin", finalUnit="Celsius", 
     conversionFormula= { it - 273.15})


     printFinalTemperature(initialMeasurement= 26.0, initialUnit= "Fahrenheit", finalUnit="Kelvin", 
     conversionFormula={5/9 * (it - 32) + 273.15})
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
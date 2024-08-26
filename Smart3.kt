open class SmartDevice(val name: String, val category: String){

}


class SmartTV(deviceName: String, deviceCategory: String):
SmartDevice(name = deviceName, category = deviceCategory)
{
    var volume: Int = 5
    set(value)
    {
        if(value in 0..100)
        {
            field = value
        }
    }
}


class SmartLight(name_Light: String, category_Light: String) : SmartDevice (name = name_Light, category = category_Light)
{
    var bright : Int = 100
    set(value)
    {
        if(value in 0..150)
        {
            field = value
        }
    }
}


//Casa inteligente no como yio
class SmartHouse(val smartTV: SmartTV, val smartLight: SmartLight)
{
    fun volumeUp()
    {
        smartTV.volume++
        println("Estas subiendo el volumen de la televisión")
    }

    fun volumeDown()
    {
        smartTV.volume--
        println("Estas bajando el volumen...")
    }



    fun brightUp()
    {
        smartLight.bright++
        println("Estás subiendo la luz de la lampara")
    }


    fun brightDown()
    {
    smartLight.bright--
    println("Estás bajando la luz..")
    }


    fun info()
    {
        println("SmartHouse: Volume: ${smartTV.volume} | brigthness: ${smartLight.bright}")
    }
}

fun main()
{
    val tv = SmartTV("Televisión 4x4", "Terreneitor")
    val lampara = SmartLight("Lámpara de dinosaurios", "Lamparon")
    val casa = SmartHouse(smartTV = tv, smartLight = lampara)

    casa.info()

    casa.volumeUp()
    casa.brightDown()

    casa.info()
}
open class SmartDevice(val name: String, val category: String){

var status = "offline"
protected set

open val deviceType = "unknown"

     open fun turnOff()
    {
         status = "offline"

    }


   open fun turnOn()
    {
         status = "online"
    }

    fun printDeviceInfo()
    {
        println("Device name: $name, category: $category, type: $deviceType")
    }
}


///////////////////////////////////////////////////////////////
class SmartTV(deviceName: String, deviceCategory: String) : SmartDevice(name = deviceName, category = deviceCategory)
{
    override val deviceType = "TV"

     internal var volume: Int = 5
     private set(value)
    {
        if(value in 0..100)
        {
            field = value
        }
    }

    fun increaseVolume()
    {
        if(status == "offline") volume++

        
    }


    fun decreaseVolume()
    {
        if(status == "offline") volume--
    }



    //Reescrita la función
    override fun turnOn()
    {
        status = "online"
        volume = 100
        println("TV $name encendida")
    }
        //Reescrita
    override fun turnOff()
    {
        status = "offine"
        volume = 0
        println("TV $name apagada")
    }
}



class SmartLight(name_Light: String, category_Light: String) : SmartDevice (name = name_Light, category = category_Light)
{
    override val deviceType = "ligth"

     internal var bright : Int = 100
     private set(value)
    {
        if(value in 0..150)
        {
            field = value
        }
    }

    override fun turnOn()
    {
        super.turnOn()
        bright = 100;
        println("La lámpara se ha encendido")
    }


    override fun turnOff()
    {
        super.turnOff()
        bright = 100;
        println("La lámpara se ha apagado")
    }

    fun increaseBright()
    {
        if(status == "online")
        bright++
    }

    fun decreaseBright()
    {
        if(status == "online")
        bright--
    }
}

//Casa inteligente no como yio
class SmartHouse(val smartTV: SmartTV, val smartLight: SmartLight)
{
    fun volumeUp()
    {
        smartTV.increaseVolume()
        println("Estas subiendo el volumen de la televisión")
    }

    fun volumeDown()
    {
        smartTV.decreaseVolume()
        println("Estas bajando el volumen...")
    }



    fun brightUp()
    {
        smartLight.increaseBright()
        println("Estás subiendo la luz de la lampara")
    }


    fun brightDown()
    {
    smartLight.decreaseBright()
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
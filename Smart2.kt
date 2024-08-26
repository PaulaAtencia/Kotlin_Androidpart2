class Smart2(val name: String, val category: String)
 {
    var deviceStatus = "online"

    constructor(name: String, category: String, statusCode: Int) : this(name, category) 
    {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }
}


fun main()
{
    val smartDevice_1 = Smart2("Smart2", "Phone3", 0)
    println(smartDevice_1.deviceStatus)
}
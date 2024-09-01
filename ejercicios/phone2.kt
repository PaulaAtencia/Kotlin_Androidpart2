 open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(isScreenLightOn: Boolean ,var isFolded: Boolean = false):Phone(isScreenLightOn)
{
    fun openFolded()
    {
        isFolded = false 
    }

    fun closeFolded()
    {
        isFolded = true
    }

        override fun switchOn()
        {
        if(!isFolded)
        {
            super.switchOn()
        }
    }
}
class Song(val title : String, val artist: String, val year: Int, val timesPlayed: Int)
{
    var isPopular: Boolean = false

    init
    {
        if(timesPlayed >=1000)
        {
            isPopular = true
        }
    }
    
    fun printInfo(): Unit 
    {
        println("[$title], interpretada por [$artist], se lanzó en $year")
    }
}

    fun main()
    {
        val song1: Song = Song("Dangerous Woman", "Ariana Grande", 2017, 5000)

        song1.printInfo()
        println("Is popular: ${song1.isPopular}")
        
    }
/*fun main() 
{
	val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
    val solarSystem = rockPlanets + gasPlanets
    
    println(solarSystem[0])
    println(solarSystem[1])
    println(solarSystem[2])
    println(solarSystem[3])
    println(solarSystem[4])
    println(solarSystem[5])
    println(solarSystem[6])
    println(solarSystem[7])

    solarSystem[3] = "Little Earth"
	println(solarSystem[3])

	val newSolarSystem = arrayOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")
	println(newSolarSystem[8])
}
 */


 fun main() {
    // Lista inicial con 10 elementos (supongamos que "Pluto" está en el índice 9)
    val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto", "Future Moon")

    // Quitar "Pluto" usando removeAt()
    solarSystem.removeAt(9)

    // Quitar "Future Moon" usando remove()
    solarSystem.remove("Future Moon")

    // Verificar si "Pluto" está en la lista usando contains()
    println(solarSystem.contains("Pluto")) // Debería mostrar false

    // Verificar si "Future Moon" está en la lista usando el operador in
    println("Future Moon" in solarSystem) // Debería mostrar false
}

fun main() {
    // Crear un MutableSet de planetas
    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    // Mostrar el tamaño del conjunto
    println(solarSystem.size)  // Debería mostrar 8

    // Agregar "Pluto" al conjunto
    solarSystem.add("Pluto")
    
    // Mostrar el tamaño del conjunto después de agregar "Pluto"
    println(solarSystem.size)  // Debería mostrar 9

    // Verificar si "Pluto" está en el conjunto
    println(solarSystem.contains("Pluto"))  // Debería mostrar true

    // Intentar agregar "Pluto" de nuevo (no se debería agregar de nuevo porque ya existe)
    solarSystem.add("Pluto")
    
    // Mostrar el tamaño del conjunto (debería seguir siendo 9)
    println(solarSystem.size)  // Debería mostrar 9

    // Quitar "Pluto" del conjunto
    solarSystem.remove("Pluto")
    
    // Mostrar el tamaño del conjunto después de quitar "Pluto"
    println(solarSystem.size)  // Debería mostrar 8

    // Verificar si "Pluto" todavía está en el conjunto
    println(solarSystem.contains("Pluto"))  // Debería mostrar false
}

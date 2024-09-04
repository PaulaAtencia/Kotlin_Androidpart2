fun main() {
    // Crear un MutableMap de planetas y el número de lunas que tienen
    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )

    // Mostrar el tamaño del mapa
    println(solarSystem.size)  // Debería mostrar 8

    // Agregar "Pluto" con 5 lunas al mapa
    solarSystem["Pluto"] = 5
    
    // Mostrar el tamaño del mapa después de agregar "Pluto"
    println(solarSystem.size)  // Debería mostrar 9

    // Mostrar el número de lunas de "Pluto"
    println(solarSystem["Pluto"])  // Debería mostrar 5

    // Intentar obtener el número de lunas de "Theia", que no está en el mapa
    println(solarSystem.get("Theia"))  // Debería mostrar null

    // Eliminar "Pluto" del mapa y mostrar el valor eliminado
    println(solarSystem.remove("Pluto"))  // Debería mostrar 5

    // Mostrar el tamaño del mapa después de quitar "Pluto"
    println(solarSystem.size)  // Debería mostrar 8

    // Actualizar el número de lunas de "Jupiter" a 78
    solarSystem["Jupiter"] = 78
    
    // Mostrar el número de lunas de "Jupiter" actualizado
    println(solarSystem["Jupiter"])  // Debería mostrar 78
}

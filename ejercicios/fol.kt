class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun main()
 {
    val groupedMenu = cookies.groupBy{ it.softBaked}
    val softBakedMenu = groupedMenu[true] ?:listOf()
    val crunchyMenu = groupedMenu[false] ?: listOf()
    val totalPrice = cookies.fold(0.0){ total, cookie ->
        total + cookie.price
    }
    val alphabeticalMenu = cookies.sortedBy{
        it.name
    }

    //Imprimir en orden alfabético
    println("Alphabetical menu:")
    alphabeticalMenu.forEach {
        println(it.name)
    }
    //Imprimir el totalPrice
    println("Total price: $${totalPrice}")

    // Imprime cada cookie en el menú
    cookies.forEach {
        println("Menu item: ${it.name}")
    }

    // Mapear las cookies a un formato "nombre - precio"
    val fullMenu = cookies.map {
        "${it.name} - $${it.price}"
    }

    // Imprimir el menú completo
    println("Full menu:")
    fullMenu.forEach {
        println(it)
    }

    println("Soft cookies:")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }
    println("Crunchy cookies:")
    crunchyMenu.forEach {
        println("${it.name} - $${it.price}")
    }
}
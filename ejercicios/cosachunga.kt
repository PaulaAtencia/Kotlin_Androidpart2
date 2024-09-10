enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING,
}

data class Event(
    val title: String,
    val description: String?,
    val daypart: Daypart,
    val durationInMinutes: Int,
)

fun main() {
    val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
    val event2 = Event(title = "Eat breakfast", description = null, daypart = Daypart.MORNING, durationInMinutes = 15)
    val event3 = Event(title = "Learn about Kotlin", description = null, daypart = Daypart.AFTERNOON, durationInMinutes = 30)
    val event4 = Event(title = "Practice Compose", description = null, daypart = Daypart.AFTERNOON, durationInMinutes = 60)
    val event5 = Event(title = "Watch latest DevBytes video", description = null, daypart = Daypart.AFTERNOON, durationInMinutes = 10)
    val event6 = Event(title = "Check out latest Android Jetpack library", description = null, daypart = Daypart.EVENING, durationInMinutes = 45)

    // Almacena todos los eventos en la lista
    val events = listOf(event1, event2, event3, event4, event5, event6)

    // Imprime cada evento
    events.forEach { event ->
        println(event)
    }

    val groupedEvents = events.groupBy {it.daypart}
    groupedEvents.forEach { (daypart, events) ->
        println("$daypart: ${events.size} events")
    }

    val durationOfEvent = if (events[0].durationInMinutes < 60) {
        "short"
    } else {
        "long"
    }
    println("Duration of first event of the day: $durationOfEvent")
    println("Duration of first event of the day: ${events[0].durationOfEvent}")
}
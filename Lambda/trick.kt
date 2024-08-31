fun main() {

    val coins: (Int) -> String = {quantity -> "$quantity quarters"}

    val cupcake: (Int) -> String = { quantity ->
        "Have a cupcake!"
    }

    val treatFunction:() -> Unit = trickOrTreat(false, coins)
    treatFunction()
    val trickFunction: () -> Unit = trickOrTreat(true, null)
    trickFunction()

    repeat(5, {trickFunction()})

}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if(isTrick){
    return trick
    }

    else
    {
        if(extraTreat !=null){
        println(extraTreat(5))
        }
        return treat
    }
}

val trick : () -> Unit = {
    println("No treats!")
}

val treat: () -> Unit = {
    println("Have a treat!")
}
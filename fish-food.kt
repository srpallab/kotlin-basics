import java.util.*


fun main() {
    feedTheFish()
}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    if(shouldChangeWater(day)){
	println("Change the Water Today")
    }
    decorationChoose()
}

fun randomDay(): String {
    val week = listOf(
	"Monday",
	"Tuesday",
	"Wednesday",
	"Thursday",
	"Friday",
	"Saturday",
	"Sunday"
    )

    return week[Random().nextInt(7)]
}

fun fishFood(day: String): String {
    return when(day){
	"Monday" -> "flakes"
	"Tuesday" -> "pellets"
	"Wednesday" -> "redworms"
	"Thursday" -> "granules"
	"Friday" -> "mosquitoes"
	"Saturday" -> "lettuce"
	"Sunday" -> "plankton"
	else -> "Fasting"
    }
}


fun shouldChangeWater(
    day: String, temperature: Int = 22, dirty: Int = 20
): Boolean{
    return when {
	isTooHot(temperature) -> true
	isDirty(dirty) -> true
	isSunday(day) -> true
	else-> false
	}
}



fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

fun decorationChoose(){
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    val eager = decorations.filter { it[0] == 'p'}
    println(eager)
}

var dirty = 20

val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
fun feedFish(dirty: Int) = dirty + 10

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun dirtyProcessor(){
    dirty = updateDirty(dirty) { dirty -> dirty + 50 }
    dirty = updateDirty(dirty, ::feedFish) 
    dirty = updateDirty(dirty, waterFilter) 
}

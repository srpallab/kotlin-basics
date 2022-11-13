fun main() {
    var birthday = readLine()
    println(birthday)
    getFortuneCookie()
}

fun getFortuneCookie(){
    val fortune = arrayOf(
	"You will have a great day",
	"Things will go well for you today.",
	"Enjoy a wonderful day of success.",
	"Be humble and all will turn out well.",
	"Today is a good day for exercising restraint.",
	"Take it easy and enjoy life!",
	"Treasure your friends because they are your greatest fortune."
    )

    println(fortune[0])
}

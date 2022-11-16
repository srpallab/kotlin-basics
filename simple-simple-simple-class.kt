class Person(var firstName: String = "Jhon", var lastName: String = "Doe"){
    // Initializer Blocks
    init {
	println("First Name: $firstName")
	println("Last Name: $lastName")
    }
}

fun main() {
    val pallab = Person("Pallab", "pal")
    println(pallab)
}

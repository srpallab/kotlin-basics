class Person constructor(_firstName: String, _lastName: String) {
    // Member Variable (Properties) of the class
    var firstName: String
    var lastName: String
    
    // Initializer Blocks
    init {
	this.firstName = _firstName
	this.lastName = _lastName
	println("First Name: $firstName")
	println("Last Name: $lastName")
    }
}

fun main() {
    val pallab = Person("Pallab", "pal")
    println(pallab)
}

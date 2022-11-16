class Person(_firstName: String, _lastName: String){
     // Member Variables (Properties) of the class
    var firstName: String = _firstName
    var lastName: String = _lastName
 
    // Initializer Block
    init {
        println("FirstName = $firstName and LastName = $lastName")
    }
}

fun main() {
    val pallab = Person("Pallab", "pal")
    println(pallab)
}

class Person (var firstName: String = "Shafiqur", var lastName: String = "Rahman"){
    var hobby: String = "Fishing"
    // This property is import for Secondary Constructor
    var age: Int? = null
    // This property is import for Secondary Overload Constructor
    var eyeColor: String? = null

    // Secondary Constructor
    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName){
	this.age = if (age > 0) age else throw IllegalArgumentException("Age must be greater than zero")
    }

    // Secondary Constructor Overload
    constructor(firstName: String, lastName: String, age: Int, eyeColor: String): 
            this(firstName, lastName, age)  {
        this.eyeColor = eyeColor
    }

    // Method
    fun sayHobby(){
	println("$firstName\'s Hobby is $hobby.")
    }
}


fun main() {
    var shafiq = Person()
    shafiq.sayHobby()
    var pallab = Person("Shafiq", "Pallab")
    pallab.sayHobby()
    var dia = Person("Habiba", "Akter", 20)
    dia.hobby = "Planting"
    dia.sayHobby()
}

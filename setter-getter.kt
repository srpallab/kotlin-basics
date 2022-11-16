class Car {
    lateinit var owner: String
    val myBrand: String = "BMW"
    // Custom Getter
	get() { return field.lowercase() }

    var myModel: String = "M5"
    // Default Setter and Getter
	private set


    var myMaxSpeed: Int = 40
	get() = field
    // Custom Setter
	set(value) {
	    field = if(value > 0) value
	    else throw IllegalArgumentException("_maxSpeed must be greater than zero")
	}

    init {
	this.owner = "Shafiq"
    }
}

fun main() {
    val myCar = Car()
    println(myCar.myBrand)
    println(myCar.myModel)
    myCar.myMaxSpeed = 100
    println(myCar.myMaxSpeed)
}

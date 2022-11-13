class Fish (var friendly: Boolean = true, volumeNeeded: Int) {
    
    val size: Int

    init {
	println("First Init Block")
    }

    constructor() : this(true, 9){
	println("Running Secondary Constructor")
    }

    init {
	if (friendly){
	    size = volumeNeeded
	} else {
	    size = volumeNeeded * 2
	}
    }

    init {
	println("Constructed fish of size $volumeNeeded final size ${this.size}")
    }

    init {
	println("Last init block")
    }
}

fun main() {
    fun makeDefaultFish() = Fish(true, 50)
    fun fishExample() {
	val fish = Fish()
	println(
	    "Is the fish is friendly? ${fish.friendly}. Need volume ${fish.size}"
	)
    }

    makeDefaultFish()
    fishExample()
}

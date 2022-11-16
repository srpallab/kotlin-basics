fun main() {
    var samsungS20 = MobilePhone(
	"Android", "Samsung", "Galaxy S20 Ultra"
    )
    var redmi9T = MobilePhone(
	"Android", "Xaomi", "Redmi 9T"
    )
    var iphone = MobilePhone("iOS", "Apple", "iPhone 12 Max Pro")
    println(samsungS20)
    println(redmi9T)
    println(iphone)
}

class MobilePhone (
    var osName: String,
    var brand: String,
    var model: String
) {
    init {
	println("Name: $osName, Brand: $brand, Model: $model")
    }
}

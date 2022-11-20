fun main() {
    val myArrayList: ArrayList<Double> = ArrayList()

    myArrayList.add(13.300)
    myArrayList.add(23.330)
    myArrayList.add(53.700)
    myArrayList.add(130.300)
    myArrayList.add(1344.300)

    var total = 0.0

    for(i in myArrayList){
	total += i
    }

    var average = total / myArrayList.size
    println("Average is: $average")
}

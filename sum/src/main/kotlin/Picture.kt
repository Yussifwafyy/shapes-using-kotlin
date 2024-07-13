class Picture(private val shape1: Shape, private val shape2: Shape, private val shape3: Shape) {

    fun sumAreas(): Double {
        return shape1.calcArea() + shape2.calcArea() + shape3.calcArea()
    }
}
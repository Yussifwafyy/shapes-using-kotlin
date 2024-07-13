class Circle(private var radius: Double = 0.0) : Shape() {

    fun setDim(radius: Double) {
        this.radius = radius
    }

    fun getDim(): Double {
        return radius
    }

    override fun calcArea(): Double {
        return Math.PI * radius * radius
    }
}
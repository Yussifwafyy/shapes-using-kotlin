class Rectangle(private var width: Double = 0.0, private var height: Double = 0.0) : Shape() {

    fun setDim(width: Double, height: Double) {
        this.width = width
        this.height = height
    }

    fun getDim(): Pair<Double, Double> {
        return Pair(width, height)
    }

    fun setHeight(height: Double) {
        this.height = height
    }

    fun getHeight(): Double {
        return height
    }

    override fun calcArea(): Double {
        return width * height
    }
}
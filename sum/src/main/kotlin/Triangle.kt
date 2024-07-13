class Triangle(private var base: Double = 0.0, private var height: Double = 0.0) : Shape() {

    fun setDim(base: Double, height: Double) {
        this.base = base
        this.height = height
    }

    fun getDim(): Pair<Double, Double> {
        return Pair(base, height)
    }

    fun setHeight(height: Double) {
        this.height = height
    }

    fun getHeight(): Double {
        return height
    }

    override fun calcArea(): Double {
        return 0.5 * base * height
    }
}
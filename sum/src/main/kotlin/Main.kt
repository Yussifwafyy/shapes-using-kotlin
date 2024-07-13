fun main() {
    val rectangle = Rectangle(4.0, 5.0)
    val circle = Circle(3.0)
    val triangle = Triangle(6.0, 4.0)

    val picture = Picture(rectangle, circle, triangle)

    println("The total area of the shapes in the picture is: ${picture.sumAreas()}")
}
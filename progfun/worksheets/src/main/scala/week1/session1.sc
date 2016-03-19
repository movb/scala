import math._
object session {
  def sqrt(x: Double) = {
    def sqrtIter(y: Double): Double =
      if (is_good(y)) y
      else sqrtIter(improve(y))

    def is_good(y: Double) =
      abs(y * y - x) / x < 0.001

    def improve(y: Double) =
      (y + x / y) / 2
    sqrtIter(1.0)
  }

  sqrt(2)
  sqrt(4)
  sqrt(1e-20)
  sqrt(1.0e50)
  sqrt(1.0e50)

  def factorial(x: Int): Int = {
    def factorialInt(x: Int, acc: Int): Int =
      if (x == 0) acc else factorialInt(x - 1, acc * x)
    factorialInt(x, 1)
  }

  factorial(5)
}

def scaleList(xs: List[Double], factor: Double): List[Double] = xs match {
  case Nil => xs
  case y :: ys => y * factor :: scaleList(ys, factor)
}

def squareList(xs: List[Double]): List[Double] = xs match {
  case Nil => xs
  case y :: ys => y * y :: squareList(ys)
}

def squareList2(xs: List[Double]): List[Double] =
  xs map (x => x*x)


squareList(List(1.0, 2.0, 3.04))

val nums = List(3, 2, -1, 0, 5, 66, 2)
val fruits = List("apple", "orange", "banana", "pineapple")

nums filter (x => x > 0)
nums filterNot (x => x > 0)
nums partition (x => x > 0)

nums takeWhile (x=> x > 0)
nums dropWhile (x=> x > 0)

nums span (x => x>0)

def pack[T](xs: List[T]): List[List[T]] = xs match {
  case Nil => Nil
  case x::xs1 => {
    val (z, zs) = xs span (z => z==x)
    z :: pack(zs)
  }
}

val some = List("a", "a", "a", "b", "c", "c", "a")
pack(some)

def encode[T](xs: List[T]):List[(T, Int)] =
  pack(xs) map (ys => (ys.head, ys.length))

encode(some)
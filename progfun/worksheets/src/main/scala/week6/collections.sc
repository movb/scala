val xs = Array(1,2,3,44)
xs map (x=>x*2)

val r = 1 until 5
val m = 1 to 5

val M = 5
val N = 2

(1 to M) flatMap (x => 1 to N  map  (y => (x,y)))

def scalarProduct(xs: Vector[Double], ys: Vector[Double]):Double =
  (xs zip ys).map(xy => xy._1 * xy._2).sum

def scalarProduct2(xs: Vector[Double], ys: Vector[Double]):Double =
  (xs zip ys).map{ case (x,y) => x*y }.sum

def isPrime(n: Int): Boolean = (2 until n).forall( x=> n%x != 0)

isPrime(17)
object pairs {
  def isPrime(n: Int): Boolean = (2 until n).forall( x=> n%x != 0)

  val N = 7
  ((1 until N) flatMap (i=>
    (1 until i) map (j => (i,j)))) filter ( pair =>
      isPrime(pair._1 + pair._2))

  for {
    i <- 1 until N
    j <- 1 until i
    if isPrime(i + j)
  } yield (i,j)
}

def scalarProduct(xs: Vector[Double], ys: Vector[Double]):Double =
  //(xs zip ys).map(xy => xy._1 * xy._2).sum
  (for { (x,y) <- (xs zip ys) } yield x*y).sum
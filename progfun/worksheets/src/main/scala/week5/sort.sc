def msort(xs: List[Int]): List[Int] = {
  val n = xs.length/2
  if (n == 0) xs
  else {
    def merge(xs: List[Int], ys: List[Int]): List[Int] = (xs, ys) match {
      case (Nil, ys1) => ys1
      case (xs1, Nil) => xs1
      case (x::xs1, y::ys1) =>
        if (x < y) x::merge(xs1,ys)
        else y::merge(xs,ys1)
    }
    val (fst,snd) = xs splitAt n
    merge(msort(fst), msort(snd))
  }
}

msort(List(3, 2, -1, 0, 5, 66, 2))
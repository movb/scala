//package week6

object nqueens {
  def queens(n: Int): Set[List[Int]] = {
    def isSafe(col: Int, queens: List[Int]):Boolean = {
      val row = queens.size
      val queensWithRaw = (row - 1 to 0 by -1) zip queens
      queensWithRaw forall {
        case (r,c) => col != c && math.abs(col-c) != row - r
      }
    }
    def placeQueens(k: Int): Set[List[Int]] =
      if (k==0) Set(List())
      else
        for {
          queens <- placeQueens(k-1)
          col <- 0 until n
          if isSafe(col, queens)
        } yield col :: queens
    placeQueens(n)
  }

  def show(queens: List[Int]) = {
    val lines =
      for (col <- queens.reverse)
        yield Vector.fill(queens.size)("* ").updated(col, "X ").mkString
    "\n" + (lines mkString "\n")
  }

  (queens(5) map show) mkString "\n"
}
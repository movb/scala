def isort(xs: List[Int]): List[Int] = xs match {
  case Nil => Nil
  case y::ys => insert(y, isort(ys))
}

def insert(x: Int, xs: List[Int]) : List[Int] = xs match {
  case Nil => List(x)
  case y::ys => if(x>y) y::insert(x, ys) else x::xs
}

val x = List(3,4,1,0)
isort(x)
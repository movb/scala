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

def last[T](xs: List[T]):T = xs match {
  case List() => throw new Error("last of empty list")
  case List(x) => x
  case y :: ys => last(ys)
}

def init[T](xs: List[T]):List[T] = xs match {
  case List() => throw new Error("init of empty list")
  case List(x) => Nil
  case x :: xs => x :: init(xs)
}

def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
  case Nil => ys
  case z::zs => z::concat(zs, ys)
}

def reverse[T](xs: List[T]): List[T] = xs match {
  case List() => List()
  case y :: ys => reverse(ys) ::: List(y)
}

def removeAt[T](xs: List[T], n: Int) = xs.take(n) ::: xs.drop(n+1)

removeAt(List('a','b','c','d'), 1)

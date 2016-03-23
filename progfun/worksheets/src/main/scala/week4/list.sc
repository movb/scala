import week3._
import week4.{Nil, Cons, List}

def singleton[T](elem: T) = new Cons[T](elem, new Nil[T])
singleton(1)
1+2

def nth[T](n: Int, xs: List[T]):T = {
  if (n < 0) throw new IndexOutOfBoundsException
  if (n == 0) xs.head
  else nth(n - 1, xs.tail)
}

val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))

nth(2, list)

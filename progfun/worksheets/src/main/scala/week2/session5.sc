def sum(f: Int => Int)(a: Int, b: Int): Int = {
  def loop(a: Int, acc:Int): Int = {
    if(a>b) acc
    else loop(a+1,acc+f(a))
  }
  loop(a,0)
}

def sumSquares(a: Int, b: Int) = sum( x => x*x )(a,b)
sum(x=>x)(1,3)

sumSquares(1,3)

//def sumCubes = sum(x => x)
//sumCubes(1,10)





class SomeClass (x: Int, y: Int) {
  private def sum(a: Int, b: Int) = a+b

  def s = sum(x,y)
}

new SomeClass(1,2).s


def concat[T](xs: List[T], ys: List[T]) = xs match {
  case List() => ys
  case z::zs => z::concat(zs, ys)
}
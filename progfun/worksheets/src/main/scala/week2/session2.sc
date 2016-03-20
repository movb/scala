def sum(f: Int => Int)(a:Int,b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a>b) acc
    else loop(a+1, acc+f(a))
  }
  loop(a, 0)
}

sum(x=>x)(3, 5)

def product(f: Int => Int)(a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a>b) acc
    else loop(a+1, acc*f(a))
  }
  loop(a, 1)
}


def fact(x: Int) = product(x=>x)(1,x)

def general(f: Int => Int, combine: (Int, Int) => Int, acc: Int)(a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a>b) acc
    else loop(a+1, combine(acc,f(a)))
  }
  loop(a, acc)
}

general(x=>x,(x,y)=>x*y,1)(1,5)

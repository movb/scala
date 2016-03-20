class Rational(x: Int, y: Int) {
  require(y != 0, "denominator must be nonzero")

  def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int = if (b==0) a else gcd(b,a % b)
  private val g = gcd(x,y)
  val numer = x/g
  val denom = y/g

  def add(that: Rational) =
    new Rational(
      numer * that.denom + that.numer*denom,
      denom*that.denom
    )

  def sub(that: Rational) =
    add(that.neg)

  def neg = new Rational(-numer, denom)

  def less(that: Rational) = this.numer * that.denom < that.numer * this.denom

  def max(that: Rational) = if(this.less(that)) that else this

  override def toString = {
    if (denom == 1)
      numer.toString
    else {
      if (numer > denom)
        (numer / denom).toString + " " +
          (numer % denom).toString + '/' + denom.toString
      else
        numer.toString + '/' + denom.toString
    }
  }
}

val x = new Rational(1,3)
val y = new Rational(5,7)
val z = new Rational(3,2)

val x = new Rational(2)

x.add(x)

x.less(y)

x.max(z)





class Rational(x: Int, y: Int) {
  require(y != 0, "denominator must be nonzero")

  def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int = if (b==0) a else gcd(b,a % b)
  private val g = gcd(x,y)
  val numer = x/g
  val denom = y/g

  def <(that: Rational) = numer*that.denom < that.numer * denom

  def max(that: Rational) = if (this < that) that else this

  def +(that: Rational) =
    new Rational(
      numer * that.denom + that.numer*denom,
      denom*that.denom
    )

  def -(that: Rational) = this + (-that)

  def unary_- = new Rational(-numer, denom)

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

x + x

x < y

x.max(z)





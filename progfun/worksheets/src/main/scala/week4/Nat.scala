package week4

/**
  * Created by mike on 29.03.16.
  */
abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor = new Succ(this)
  def + (that: Nat): Nat
  def - (that: Nat): Nat

  def toString(x: Int): String
}

object Zero extends Nat {
  def isZero = true
  def predecessor = throw new Error("0.predecessor")
  def + (that: Nat) = that
  def - (that: Nat) = if (that.isZero) Zero else throw new Error("value<0")

  override def toString() = "0"
  def toString(x: Int) = x.toString
}

class Succ(n: Nat) extends Nat {
  def isZero = false
  def predecessor = n
  def + (that: Nat) = new Succ(n + that)
  def - (that: Nat) = if (that.isZero) this else n - that.predecessor

  override def toString() = toString(0)
  def toString(x: Int) = n.toString(x+1)
}

package week4

trait Expr {
  def eval(e: Expr): Int = e match {
    case Number(n) => n
    case Var(_, n) => n
    case Sum(e1, e2) => eval(e1) + eval(e2)
    case Prod(e1, e2) => eval(e1) * eval(e2)
  }

  def toString(par: Boolean): String = this match {
    case Number(n) => n.toString
    case Var(name, _) => name
    case Sum(e1, e2) => (if (par) "( " else "") + e1.toString + " + " + e2.toString + (if (par) " )" else "")
    case Prod(e1, e2) => e1.toString(true) + " * " + e2.toString(true)
  }

  override def toString(): String = toString(false)
}
case class Number(n: Int) extends Expr
case class Var(name: String, n: Int) extends Expr
case class Sum(e1: Expr, e2: Expr) extends Expr
case class Prod(e1: Expr, e2: Expr) extends Expr
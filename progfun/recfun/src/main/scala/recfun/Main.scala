package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    /*
    def fact(x: Int): Int = {
      def factInt(x: Int, acc: Int): Int =
        if (x==0) acc else factInt(x-1,acc*x)
      factInt(x,1)
    }

    fact(r)/(fact(c)*fact(r-c))
    */
    if(r==1 || c==0) 1
    else pascal(c-1,r-1) + pascal(c,r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balanceInt(chars: List[Char], cnt:Int):Boolean = {
      if (chars.isEmpty) cnt==0
      else {
        if (cnt<0) false
        else balanceInt(chars.tail,
          if(chars.head == '(') cnt+1
          else { if (chars.head == ')') cnt -1 else cnt })
      }
    }
    balanceInt(chars,0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if(money == 0) 1
    else {
      if (coins.isEmpty || money < 0) 0
      else countChange(money - coins.head, coins) + countChange(money, coins.tail)
    }
  }
}

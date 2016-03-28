val xs = Stream.cons(1, Stream.cons(2, Stream.empty))

Stream(1,2,3)

(1 to 1000).toStream

def streamRange(lo: Int, hi: Int): Stream[Int] =
  if(lo >= hi) Stream.empty
  else Stream.cons(lo, streamRange(lo + 1, hi))

def from(n: Int): Stream[Int] = n #:: from(n+1)

def sieve(s: Stream[Int]): Stream[Int] =
  s.head #:: sieve(s.tail filter (_ % s.head != 0))


sieve(from(2)).take(10).toList
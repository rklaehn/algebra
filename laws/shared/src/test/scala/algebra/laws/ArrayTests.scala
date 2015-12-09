package algebra.laws

import algebra.std.all._
import algebra.{PartialOrder, Order}
import org.scalatest.FunSuite
import org.scalatest.prop.Checkers

class ArrayInstanceTests extends FunSuite with Checkers {
  check { (a: Array[Int], b: Array[Int]) =>
    Order[Array[Int]].compare(a, b) == Ordering.Iterable[Int].compare(a.toList, b.toList)
  }
  check { (a: Array[Int], b: Array[Int]) =>
    PartialOrder[Array[Int]].partialCompare(a, b) == Ordering.Iterable[Int].compare(a.toList, b.toList)
  }
}

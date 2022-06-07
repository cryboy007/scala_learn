package com.github.cryboy007

object For表达式 extends App {
  case class User(name: String, age: Int)

  val userBase = List(User("Travis", 28),
    User("Kelly", 33),
    User("Jennifer", 44),
    User("Dennis", 23))

  val no35 = for (item <- userBase if item.age <= 25)
    //yield 语句实际上会创建一个 List
    yield item.name  // i.e. add this to a list

  no35.foreach(println)



  def foo(n: Int, v: Int) =
    for (i <- 0 until n;
         j <- i until n if i + j == v)
    yield (i, j)

  foo(10, 10) foreach {
    case (i, j) =>
      println(s"($i, $j) ")  // prints (1, 9) (2, 8) (3, 7) (4, 6) (5, 5)
  }
}

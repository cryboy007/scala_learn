package com.github.cryboy007

import scala.util.Random

/**
 * unapply 提取器对象
 */
object CustomerID extends App {
  def apply(name: String) = s"$name--${Random.nextLong}"

  def unapply(customerID: String): Option[String] = {
    val stringArray: Array[String] = customerID.split("--")
    if (stringArray.tail.nonEmpty) Some(stringArray.head) else None
  }
//  这里 apply 方法用 name 创建一个 CustomerID 字符串。而 unapply 方法正好相反，它返回 name 。当我们调用 CustomerID("Sukyoung") ，
//  其实是调用了 CustomerID.apply("Sukyoung") 的简化语法。当我们调用 case CustomerID(name) => println(name)，就是在调用提取器方法。
  val customer1ID = CustomerID("Sukyoung")  // Sukyoung--23098234908
  customer1ID match {
    case CustomerID(name) => println(name)  // prints Sukyoung
    case _ => println("Could not extract a CustomerID")
  }

  val customer2ID = CustomerID("Nico")
  println(customer2ID)
  val CustomerID(name) = customer2ID
  println(name)
  //  等价上面
  println(CustomerID.unapply(customer2ID).get)

  val CustomerID(name2) = "--asdfasdfasdf"
  println(name2)

  //如果没有匹配的值，会抛出 scala.MatchError：
  val CustomerID(name3) = "-asdfasdfasdf"

}

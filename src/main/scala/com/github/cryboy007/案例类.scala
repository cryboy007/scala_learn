package com.github.cryboy007

/**
 * 案例类在比较的时候是按值比较而非按引用比较
 */
object 案例类 {
  def main(args: Array[String]): Unit = {
    val message = Message("张三","你在吗")
    println(message.sender)

    val message1 = Message("李四", "我在")
    val message2 = message1.copy(sender = "王五")
    val message3 = message1.copy()
    println(message2)
    println(message3)

  }
}

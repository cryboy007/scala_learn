package com.github.cryboy007

import scala.util.Random

object 模式匹配 {
  def main(args: Array[String]): Unit = {
    val x: Int = Random.nextInt(10)

    val str = x match {
      case 0 => "ZERO"
      case 1 => "ONE"
      case _ => "OTHER"
    }
    println(str)
  }
}

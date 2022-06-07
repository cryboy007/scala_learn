package com.github.cryboy007

import java.util.concurrent.TimeUnit

object HelloWorld {
   def main(args: Array[String]): Unit = {
    println("hello world")
    val value = add(5, 10)
    println(value)
    TimeUnit.SECONDS.sleep(10)
    println("=====>>>")
  }


  def add(i:Int,j:Int): Int = {
    i + j;
  }
}

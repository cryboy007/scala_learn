package com.github.cryboy007

import scala.concurrent.ExecutionContext


object 多参数列表 {


  def main(args: Array[String]): Unit = {
//    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    val function = numbers.foldLeft(0)((a,b) => a * b)
//    println(numbers.foldRight(20)(_ + _))


    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numberFunc = numbers.foldLeft(List[Int]())_

    val squares = numberFunc((xs, x) => xs:+ x*x)
    print(squares.toString()) // List(1, 4, 9, 16, 25, 36, 49, 64, 81, 100)

    val cubes = numberFunc((xs, x) => xs:+ x*x*x)
    print(cubes.toString())  // List(1, 8, 27, 64, 125, 216, 343, 512, 729, 1000)

    val service = new TraitService2()
  }
}

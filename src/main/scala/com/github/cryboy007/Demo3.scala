package com.github.cryboy007

object Demo3 {
  def main(args: Array[String]): Unit = {
    //元祖
    val ingredient = ("Sugar", 25): (String, Int)

    println(ingredient._1)
    println(ingredient._2)
    //解构
    val (name, name2) = ingredient
    println(name + " " + name2)

    modelMatch()

    printFor()
  }


  private def printFor(): Unit = {
    val list = List(("张三", 4), ("李四", 5), ("王五", 6))

    for ((name, age) <- list) {
      println(name + "-" + age)
    }
  }

  def modelMatch(): Unit = {
    val planetDistanceFromSun = List(("Mercury", 57.9), ("Venus", 108.2), ("Earth", 149.6), ("Mars", 227.9), ("Jupiter", 778.3))

    planetDistanceFromSun.foreach { tuple => {

      tuple match {

        case ("Mercury", distance) => println(s"Mercury is $distance millions km far from Sun")

        case p if (p._1 == "Venus") => println(s"Venus is ${p._2} millions km far from Sun")

        case p if (p._1 == "Earth") => println(s"Blue planet is ${p._2} millions km far from Sun")

        case _ => println("Too far....")

      }

    }
    }
  }

}

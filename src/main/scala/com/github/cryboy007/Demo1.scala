package com.github.cryboy007

object Demo1 {
  def main(args: Array[String]): Unit = {
    var i = 1 + 1
    i = 4
    var j : Int = 1+2
    println(i)
    println(j)

    println({
      var i = 3
      i + 3
    })

    //函数
    var del = (i : Int,j: Int) => {
      //println(i - j)
      i -j
    }
    println(del(10, 5))

    println(HelloWorld.add(10, 25))

    //特质
    var traitService:TraitService = new TraitService {}

    traitService.add(100,200)

    val demo = new Demo2(y = 100)
    println(demo.y)

    val point = new Point
    println(point.x)
    point.x = 10
    println(point.x)
    println("------------接口-----------")
    val intTrait = new IntTrait(5)
    while (intTrait.hasNext)
      println(intTrait.next)

  }
}

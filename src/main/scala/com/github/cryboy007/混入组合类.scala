package com.github.cryboy007

import com.github.cryboy007.service.D

object 混入组合类 {
  def main(args: Array[String]): Unit = {
    val d = new D
    println(d.message)

    println(d.loudMessage)
  }
}

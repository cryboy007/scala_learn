package com.github.cryboy007

import scala.concurrent.ExecutionContext

//特质  有点类似接口
trait TraitService {
  //def multiply(i:Int,j:Int): Unit

  //如果要指定参数列表中的某些参数为隐式（implicit），应该使用多参数列表。例如：
  def execute(arg: Int)(implicit ec: ExecutionContext): Nothing = ???
  def add(i:Int,j:Int): Unit = {
    println(i+j)
  }
}

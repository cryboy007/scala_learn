package com.github.cryboy007

class Demo2(var x:Int = 0,var y:Int = 10){
  def test(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }

}

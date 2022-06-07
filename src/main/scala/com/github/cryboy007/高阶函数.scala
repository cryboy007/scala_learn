package com.github.cryboy007

object 高阶函数 extends App {
  val salaries = Seq(20000, 70000, 40000)
  val doubleSalary = (x: Int) => x * 2

  val newValue: Seq[Int] = salaries.map(doubleSalary)

  newValue foreach println

  salaries.map(_ * 2)
  def getUrl = URLBuilder(ssl = true, "znsd.top")
  val endpoint = "users"
  val query = "id=1"
  //返回函数的函数
  val url = getUrl(endpoint, query)
  println(url)

  def URLBuilder(ssl:Boolean,domainName:String) :(String,String) => String ={
    val schema = if (ssl) "https://" else "http://"
    (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
  }
  //嵌套方法
  def factorial(x: Int): Int = {
    def fact(x: Int, accumulator: Int): Int = {
      if (x <= 1) accumulator
      else fact(x - 1, x * accumulator)
    }
    fact(x, 1)
  }

  println("Factorial of 2: " + factorial(2))
  println("Factorial of 3: " + factorial(3))
}

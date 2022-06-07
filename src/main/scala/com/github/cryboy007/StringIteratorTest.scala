package com.github.cryboy007

import com.github.cryboy007.service.{RichIterator, StringIterator}

object StringIteratorTest extends App {
  class RichStringIter extends StringIterator("Scala") with RichIterator

  val richStringIter = new RichStringIter
  richStringIter foreach println
}

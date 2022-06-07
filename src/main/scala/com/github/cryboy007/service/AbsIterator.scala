package com.github.cryboy007.service

abstract class AbsIterator {
  type T
  def hasNext: Boolean
  def next(): T
}

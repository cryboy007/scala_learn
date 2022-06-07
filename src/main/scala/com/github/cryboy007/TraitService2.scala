package com.github.cryboy007
import scala.concurrent.ExecutionContext

class TraitService2 extends TraitService {
  override def execute(arg: Int)(implicit ec: ExecutionContext): Nothing = super.execute(arg)
}

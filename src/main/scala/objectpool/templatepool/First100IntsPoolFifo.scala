package objectpool.templatepool

import scala.collection.mutable

class First100IntsPoolFifo extends AbstractObjectPool[Int](100) {
  override protected def createPool(n: Int): List[Int] = (0 until n).toList
  override def borrow(): Int = pool.remove(0)
}

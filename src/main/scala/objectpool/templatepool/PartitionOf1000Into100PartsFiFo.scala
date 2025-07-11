package objectpool.templatepool

class PartitionOf1000Into100PartsFiFo extends AbstractObjectPool[Int](1000) {
  override protected def createPool(n: Int): List[Int] = (0 until n by n/100).toList
  override def borrow(): Int = pool.remove(0)
}

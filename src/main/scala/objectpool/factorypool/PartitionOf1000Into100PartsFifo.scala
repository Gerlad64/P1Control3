package objectpool.factorypool

class PartitionOf1000Into100PartsFifo
extends AbstractObjectPool[Int](
  1000,
  new IntFactory {
    override def create(n: Int): List[Int] = (0 until n by n/100).toList
  }
) {

  override def borrow(): Int = pool.remove(0)
}

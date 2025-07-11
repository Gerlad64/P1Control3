package objectpool.factorypool

class First100IntsPoolFifo extends AbstractObjectPool[Int](100, new IntFactory){

  override def borrow(): Int = pool.remove(0)
}

package objectpool.factorypool

import scala.util.Random

class First100IntsPoolRandom extends AbstractObjectPool[Int](100, new IntFactory) {
  val index: Int = Random.nextInt(pool.size)

  override def borrow(): Int = pool.remove(index)
}

package objectpool.templatepool

import scala.util.Random.shuffle
import scala.util.Random

class First100IntsPoolRandom extends AbstractObjectPool[Int](100) {
  val index: Int = Random.nextInt(pool.size)
  override protected def create(n: Int): List[Int] = (0 until n).toList
  override def borrow(): Int = pool.remove(index)
}

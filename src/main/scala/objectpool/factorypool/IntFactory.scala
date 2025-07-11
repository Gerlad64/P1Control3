package objectpool.factorypool

class IntFactory extends Factory[Int] {
  override def create(n: Int): List[Int] = (0 until n).toList
}

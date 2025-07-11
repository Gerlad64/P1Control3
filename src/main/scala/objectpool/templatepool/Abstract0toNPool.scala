package objectpool.templatepool

/**
 * Por si se desea abstraer la creación de listas de 0 a n
 * @param n
 */
abstract class Abstract0toNPool(n: Int) extends AbstractObjectPool[Int](n) {
  override protected def create(n: Int): List[Int] = (0 until n).toList
}

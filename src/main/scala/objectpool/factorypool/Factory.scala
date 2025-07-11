package objectpool.factorypool

trait Factory[T]:
  def create(n: Int): List[T]

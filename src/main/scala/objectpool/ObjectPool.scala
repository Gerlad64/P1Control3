package objectpool



trait ObjectPool[T] {
  def borrow(): T
  def release(obj: T): Unit
}

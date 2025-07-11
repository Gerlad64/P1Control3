package objectpool.factorypool
import objectpool.ObjectPool

import scala.collection.mutable

abstract class AbstractObjectPool[T](n: Int, factory: Factory[T]) extends ObjectPool[T] {
  protected val pool: mutable.Buffer[T] = factory.create(n).toBuffer

  override def release(obj: T): Unit = pool += obj
}

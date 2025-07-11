package objectpool.templatepool
import objectpool.ObjectPool

import scala.collection.mutable

abstract class AbstractObjectPool[T](n: Int) extends ObjectPool[T] {
  /**
   * Cada clase implementa cómo construye su pool
   */
  protected val pool: mutable.Buffer[T] = createPool(n).toBuffer

  /**
   * Para los tests.
   * @return pool
   */
  def getPool: mutable.Buffer[T] = pool
  /**
   * Metodo abstracto para crear pool
   * @return el pool creado
   */
  protected def createPool(n: Int): List[T]

  override def release(obj: T): Unit = pool += obj
}

package templatepool

import objectpool.templatepool.First100IntsPoolFifo
import munit.FunSuite

class First100IntsPoolFifoTest extends FunSuite {

  val myIntPool = new First100IntsPoolFifo

  test("Inicialización funciona") {
    println(myIntPool.getPool)
  }
}

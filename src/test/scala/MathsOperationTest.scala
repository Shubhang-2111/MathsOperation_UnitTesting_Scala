import org.scalatest.funsuite.AnyFunSuite

class MathsOperationTest extends AnyFunSuite {
  test("MathsOperation.add") {
    assert(MathsOperation.add(3, 4) === 7)
    assert(MathsOperation.add(10000, 20000) === 30000)
    assert(MathsOperation.add(-3, -9) === -12)
  }

  test("MathsOperation.subtract") {
    assert(MathsOperation.subtract(5, 2) === 3)
    assert(MathsOperation.subtract(90000, 60000) === 30000)
    assert(MathsOperation.subtract(5, 2) === 3)
  }

  test("MathsOperation.multiply") {
    assert(MathsOperation.multiply(5, 2) === 10)
    assert(MathsOperation.multiply(90, 60) === 5400)
    assert(MathsOperation.multiply(-5, -7) === 35)
  }

  test("MathsOperation.divide") {
    assert(MathsOperation.divide(8, 2) === 4)
    assert(MathsOperation.divide(100, 50) === 2)
    assert(MathsOperation.divide(-500, -100) === 5)
  }
}

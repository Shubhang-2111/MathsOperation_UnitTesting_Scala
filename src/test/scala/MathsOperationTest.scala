//import org.scalatest.funsuite.AnyFunSuite
//
//class MathsOperationTest extends AnyFunSuite {
//  test("MathsOperation.add") {
//    assert(new MathsOperation.add(3, 4) === 7)
//    assert(new MathsOperation.add(10000, 20000) === 30000)
//    assert(new MathsOperation.add(-3, -9) === -12)
//  }
//
//  test("MathsOperation.subtract") {
//    assert(new MathsOperation.subtract(5, 2) === 3)
//    assert(MathsOperation.subtract(90000, 60000) === 30000)
//    assert(MathsOperation.subtract(5, 2) === 3)
//  }
//
//  test("MathsOperation.multiply") {
//    assert(MathsOperation.multiply(5, 2) === 10)
//    assert(MathsOperation.multiply(90, 60) === 5400)
//    assert(MathsOperation.multiply(-5, -7) === 35)
//  }
//
//  test("MathsOperation.divide") {
//    assert(MathsOperation.divide(8, 2) === 4)
//    assert(MathsOperation.divide(100, 50) === 2)
//    assert(MathsOperation.divide(-500, -100) === 5)
//  }
//}

import org.scalatest.funsuite.AnyFunSuite

class MathsOperationTest extends AnyFunSuite {
  test("MathsOperation.add") {
    assert(new MathsOperation(3, 4).add() === 7)
    assert(new MathsOperation(10000, 20000).add() === 30000)
    assert(new MathsOperation(-3, -9).add() === -12)
  }

  test("MathsOperation.subtract") {
    assert(new MathsOperation(5, 2).subtract() === 3)
    assert(new MathsOperation(90000, 60000).subtract() === 30000)
    assert(new MathsOperation(-5, -2).subtract() === -3)
  }

  test("MathsOperation.multiply") {
    assert(new MathsOperation(5, 2).multiply() === 10)
    assert(new MathsOperation(90, 60).multiply() === 5400)
    assert(new MathsOperation(-5, -7).multiply() === 35)
  }

  test("MathsOperation.divide") {
    assert(new MathsOperation(8, 2).divide() === 4)
    assert(new MathsOperation(100, 50).divide() === 2)
    assert(new MathsOperation(-500, -100).divide() === 5)
  }
}

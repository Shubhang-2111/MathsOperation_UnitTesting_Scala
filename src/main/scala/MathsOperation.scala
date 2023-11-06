import scala.util.Try

class MathsOperation(num1: Int, num2: Int) {
  def add(): Int = {
    num1 + num2
  }

  def subtract(): Int = {
    num1 - num2
  }

  def multiply(): Int = {
    num1 * num2
  }

  def divide(): Int = {
    num1 / num2
  }
}

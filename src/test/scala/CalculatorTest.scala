import org.scalatest.{FunSpec, BeforeAndAfter, Matchers}
import com.mikekrisher.scala_test._

class CalculatorTest extends FunSpec with BeforeAndAfter with Matchers {

  var subject: Calculator = _

  before {
    subject = new Calculator
    println("an instance of Calculator is created as the subject")
  }

  describe("Calculator#cube") {
    it("should cube a passed number") {
      assert(subject.cube(3) === 27)
    }
  }

  describe("Calculator#times3") {
    it("should multiply a number by three") {
      assert(subject.times3(4) === 12)
    }
  }

  // class functions
  describe("Calculator.multiplier") {
    it("should multiple a given number by a multiplier") {
      assert(Calculator.multiply(2, 4) === 8)
    }
  }

  describe("Calculator.divide") {
    it("should divide a given number by a divisor") {
      Calculator.divide(4,2) shouldEqual 2
    }
  }
}

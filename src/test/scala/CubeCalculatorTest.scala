import org.scalatest.FunSpec
import org.scalatest.BeforeAndAfter
import com.mikekrisher.scala_test._

class CubeCalculatorTest extends FunSpec with BeforeAndAfter {

  var subject: CubeCalculator = _

  before {
    subject = new CubeCalculator
    println("an instance of CubeCalculator is created as the subject")
  }

  describe("CubeCalculator#cube") {
    it("should cube a passed number") {
      assert(subject.cube(3) === 27)
    }
  }

  describe("CubeCalculator#times3") {
    it("should multiply a number by three") {
      assert(subject.times3(4) === 12)
    }
  }

  // class functions
  describe("CubeCalculator.multiplier") {
    it("should multiple a given number by a multiplier") {
      assert(CubeCalculator.multiply(2, 4) === 8)
    }
  }
}

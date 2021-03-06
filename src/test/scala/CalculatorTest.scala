import org.scalatest.{FunSpec, BeforeAndAfter, Matchers}
import org.scalatest.mock.MockitoSugar

import com.mikekrisher.scala_test._

import org.mockito.ArgumentCaptor
import org.mockito.Matchers.any
import org.mockito.Mockito._

import java.io._

class CalculatorTest extends FunSpec with BeforeAndAfter with Matchers with MockitoSugar {

  var subject: Calculator = _

  before {
    subject = new Calculator
    println(s"a Calculator instance named ${subject.name.getOrElse("unknown")} is created as the subject")
  }

  // instance methods
  describe("Calculator#name") {
    it("should return the name if passed into the constructor") {
      subject = new Calculator(Some("my calculator"))
      assert(subject.name.getOrElse("not set") == "my calculator")
    }

    it("should return None if it is not passed into the constructor") {
      subject = new Calculator
      assert(subject.name == None) // frowned upon in scala to use null
    }
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

  describe("Calculator#render") {
    it("should write something to disk using an IO object") {
      val text   = "foo"
      // create a mock object to receive write and close message
      val buffer = mock[BufferedWriter]

      assert(subject.render(text, buffer) === true)
    }
  }

  describe("Calculator#squares") {
    it("should square a single number in a list") {
      val nums = List(2)
      assert(subject.squares(nums) === List(4))
    }

    it("should square a list of numbers") {
      val nums = List(2,4)
      assert(subject.squares(nums) === List(4,16))
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

    // nested describe to show context
    describe("with zero as a divisor") {
      it("should throw an exception") {
        intercept[ArithmeticException] {
          Calculator.divide(4,0)
        }
      }
    }
  }
}

/*
 *  // RSpec version of tests
 *
 *  require Calculator
 *
 *  RSpec.describe Calculator do
 *    subject { Calculator.new }
 *
 *    before do
 *      @calculator = subject
 *    end
 *
 *    describe "#name" do
 *      it "should set the name if passed in" do
 *         subject = Calculator.new("my calculator")
 *         expect(subject.name).to eq("my calculator")
 *      end
 *
 *      it "should set name to null by default" do
 *         expect(subject.name).to eq(null)
 *      end
 *    end
 *
 *    describe "#cube" do
 *      it "should cube the given number" do
 *        expect(subject.cude(3)).to eq(27)
 *      end
 *    end
 *
 *    describe "#time3" do
 *      it "should multiply the given number be 3" do
 *        expect(subject.times3(4)).to eq(12)
 *      end
 *    end
 *
 *    describe "#render" do
 *      it "should write contents to a buffer" do
 *        expect(File).to receive(:write).and_return(true)
 *        expect(subject.render("foo")).to eq(true)
 *      end
 *    end
 *
 *    describe "#squares" do
 *      it "should square a single number in an array" do
 *         numbers = [2]
 *         expect(subject.squares(numbers)).to eq([4])
 *      end
 *
 *      it "should square all numbers in an array" do
 *         numbers = [2,4]
 *         expect(subject.squares(numbers)).to eq([4,16])
 *      end
 *    end
 *
 *    describe "self.multiply" do
 *      it "should multiply a given number by a multiplier" do
 *        expect(described_class.multiply(2,4)).to eq(8)
 *      end
 *    end
 *
 *    describe "self.divide" do
 *      it "should divide a given number by a divisor" do
 *        described_class.divide(4,2).should eq(2)
 *      end
 *
 *      context "with zero as the divisor" do
 *        it "should throw an exception" do
 *          expect {
 *            described_class.divide(4,0)
 *          }.to raise_error
 *        end
 *      end
 *    end
 *  end
 */

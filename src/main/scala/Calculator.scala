package com.mikekrisher.scala_test
import java.io._

// Scala version of class

// class with instance methods
class Calculator {
  def cube(x: Int) = 
  {
    x * x * x
  }

  def times3(x: Int) = 
  {
    x * 3
  }

  def render(text: String, buffer: BufferedWriter): Boolean = 
  {
    buffer.write(text)
    buffer.close()

    return true
  }
}

// object with class functions
object Calculator {
  def multiply(x: Int, multiplier: Int) = 
  {
    x * multiplier
  }

  def divide(x: Int, divisor: Int) = 
  {
    x / divisor
  }
}


/*
 * // Ruby version of class
 *
 * class Calculator
 *   def self.multiply(x, multiplier)
 *     x * multiplier
 *   end
 *
 *   def self.divide(x, divisor)
 *     x / divisor
 *   end
 *
 *   def cube(x)
 *     x * x * x
 *   end
 *
 *   def times3(x)
 *      x * 3
 *   end
 *
 *   def render(text)
 *     File.write(text) // not the same API as a Scala
 *   end
 * end
 */

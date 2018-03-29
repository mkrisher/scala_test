package com.mikekrisher.scala_test

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
 * end
 */

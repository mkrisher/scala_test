package com.mikekrisher.scala_test

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

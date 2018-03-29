package com.mikekrisher.scala_test

// class with instance methods
class CubeCalculator {
  def cube(x: Int) = {
    x * x * x
  }

  def times3(x: Int) = {
    x * 3
  }
}

// object with class functions
object CubeCalculator {
  def multiply(x: Int, multiplier: Int) = 
  {
    x * multiplier
  }
}

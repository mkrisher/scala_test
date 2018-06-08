# An intro to ScalaTest for Rubyists

  A repo/playground for exploring various aspects of ScalaTest

# Running tests

  `sbt test`

  Or in the sbt console

  `sbt`

  `test`

  or

  `test:testOnly *CaculatorTest`

# Notes

  The first commit includes the scaffolding of the project built 
  using the sbt scalatest [template](https://github.com/scala/scalatest-example.g8)

  The second commit shows an example of how to test a class (instance methods and class functions) 
  using FunSpec, which is similar to RSpec for Ruby

  A later commit adds the equivalent Ruby and RSpec classes and specs as comments at the bottom of 
  the Scala files for comparison

  A later commit includes an example of mocking an object using Mockito

  A later commit includes an example of a Scala Option. Nulls are frowned upon in Scala. So rather 
  than doing null checks, Scala has an Option type. If you do not set a value, the Option will 
  return None. Option in some ways is the equivalent of the Ruby ||= operator. If an Option has 
  a value, it is wrapped in a Some object. You get to the actual value using .getOrElse or .map.


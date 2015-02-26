package com.github.raphaelpanta.unittest

import org.junit.runner.RunWith
import org.specs2.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class FizzBuzzSpec extends Specification {

  def is() =
    s2"""
      This is a specification of FizzBuzz
        When a number is divisible 
          by 3 it should print Fizz $shouldBeFizz
          by 5 it should print Buzz $shouldBeBuzz
          by 3 and 5 it should print FizzBuzz $shouldBeFizzBuzz
        When a number is not divisible 
          by 3 or 5 it should print the number $shouldBeANumber
        From a list of integer 1 to 100
          it should print a list of FizzBuzz string $shouldPrintAFizzBuzzList
      """

  def shouldBeFizz = failure
  def shouldBeBuzz = failure
  def shouldBeFizzBuzz = failure
  def shouldBeANumber = failure
  def shouldPrintAFizzBuzzList = failure
}
package com.github.raphaelpanta

class FizzBuzz {

  def fizzBuzz(number: Int): String = number match {
    case 3 => "Fizz"
    case 5 => "Buzz"
  }
}
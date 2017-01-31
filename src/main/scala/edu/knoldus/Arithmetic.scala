package edu.knoldus

class Arithmetic {

  def sum(x: Int, y: Int): Int = {


    x + y

  }

  def multiply(x: Int, y: Int): Int = {

    x * y

  }

  def divide(x: Int, y: Int): Int = {
    require(y != 0)
    x / y

  }

}

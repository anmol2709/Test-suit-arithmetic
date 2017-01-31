package edu.knoldus

import org.scalatest.FunSuite

class ArithmeticTest extends FunSuite {

  val arithmeticObject = new Arithmetic
  test("Checking addition") {
    assert(arithmeticObject.sum(5, 2) == 7)
  }

  test("Checking product") {
    assert(arithmeticObject.multiply(5, 2) == 10)
  }

  test("Checking Division") {

    assert(arithmeticObject.divide(9, 2) == 4)

  }
  test("Checking Division By Zero") {
    intercept[IllegalArgumentException] {
      arithmeticObject.divide(1, 0)
    }


  }


}

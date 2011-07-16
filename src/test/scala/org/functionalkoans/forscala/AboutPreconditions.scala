package org.functionalkoans.forscala

import org.scalatest.matchers.ShouldMatchers
import support.BlankValues.__
import support.KoanSuite

class AboutPreconditions extends KoanSuite with ShouldMatchers {

  class WithParameterRequirement(val myValue: Int) {
    require(myValue != 0)

    def this(someValue: String) {
      this (1)
    }
  }

  // Instruction: use Intercept to catch the type of exception thrown by an invalid precondition
  koan("On precondition violation, intercept expects type of exception thrown") {
    intercept[IllegalArgumentException] {
      val myInstance = new WithParameterRequirement(__)
    }
  }
}




	

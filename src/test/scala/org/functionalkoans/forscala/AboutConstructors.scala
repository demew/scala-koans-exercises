package org.functionalkoans.forscala

import org.scalatest.matchers.ShouldMatchers
import support.BlankValues.__
import support.KoanSuite

class AboutConstructors extends KoanSuite with ShouldMatchers {

  class AboutConstructorWithAuxiliaryConstructor(val name: String) {
    // invoke auxiliary constructor
    def this() {
      // what happens if you comment out the following line?
      // "error: 'this' expected but } found"
      this ("defaultname")
    }
  }

  // this seems to pass as is
  koan("Primary constructor specified with a parameter requires that parameter to be passed in") {
    val aboutMe = new AboutConstructorWithAuxiliaryConstructor()

  }

  class AboutClassWithNoClassParameter {
  }


  koan("Class with no class parameters is called with no arguments") {
    // add parameter to make this fail
    // "too many arguments for constructor AboutClassWithNoClassParameter"
    val aboutMe = new AboutClassWithNoClassParameter()

  }
}

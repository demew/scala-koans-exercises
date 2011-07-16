package org.functionalkoans.forscala

import org.scalatest.matchers.ShouldMatchers
import support.BlankValues.__
import support.KoanSuite

class AboutValAndVar extends KoanSuite with ShouldMatchers {

  koan("vars may be reassigned") {
    var a = 5
    a should be(__)

    a = 7
    a should be(__)
  }

  koan("vals may not be reassigned") {
    val a = 5
    a should be(__)

    // What happens if you uncomment these lines?
    // a = 7
    // a should be (7)
  }


}
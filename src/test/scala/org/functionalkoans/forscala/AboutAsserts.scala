package org.functionalkoans.forscala

import org.scalatest.matchers.ShouldMatchers
import support.BlankValues.__
import support.KoanSuite

class AboutAsserts extends KoanSuite with ShouldMatchers {

  koan("should be true") {
    assert(false) // should be true
  }

  koan("should be true with message") {
    assert(false, "This should be true")
  }

  koan("should be true with should matchers") {
    true should be(__) // should be true
  }

  koan("should match two equal values") {
    val v1 = 4
    val v2 = 4

    assert(v1 === __)
  }

  koan("sometimes we expect you to fill in the values") {
    assert(1 + 1 === __)
  }
}

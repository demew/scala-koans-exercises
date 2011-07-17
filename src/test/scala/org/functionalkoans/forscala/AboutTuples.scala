package org.functionalkoans.forscala

import support.KoanSuite
import support.BlankValues.__
import org.scalatest.matchers.ShouldMatchers
import java.util.Date

class AboutTuples extends KoanSuite with ShouldMatchers {

  koan("Tuples can be created easily") {
    val tuple = ("apple", "dog")
    tuple should be(("apple", "dog"))
  }

  koan("Tuple items may be accessed individually") {
    val tuple = ("apple", "dog")
    val fruit = tuple._1
    val animal = tuple._2

    fruit should be("apple")
    animal should be("dog")
  }

  koan("Tuples may be of mixed type") {
    val tuple5 = ("a", 1, 2.2, new Date(), BigDecimal(5))

    // The isInstanceOfs do not compile with __
    tuple5._1.isInstanceOf[String]
    tuple5._2.isInstanceOf[Int]
    tuple5._3 should be(2.2)
    tuple5._4.isInstanceOf[Date]
    tuple5._5 should be(BigDecimal(5))
  }


}

package com.example

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.{GivenWhenThen, FeatureSpec}
import unfiltered.scalatest.jetty.Served
import org.apache.http.util.EntityUtils

class ExampleFeature extends FeatureSpec with Served with GivenWhenThen with ShouldMatchers {
  import dispatch._

  def setup = {
    _.filter(new App)
  }

  feature("rest app") {
    val http = new Http

    scenario("should validate integers") {
      given("an invalid int and a valid palindrome as parameters")
        val params = Map("int" -> "x", "palindrome" -> "twistsiwt")
      when("parameters are posted")
        val (status, body) = http.x((host << params)) {
          case (code, _, Some(body)) => (code, EntityUtils.toString(body))
        }
      then("status is BAD Request")
        status should be(400)
      and("""body includes "x is not an integer" """)
        body should include("x is not an integer")
    }

    scenario("should validate palindrome") {
      given("a valid int and an invalid palindrome as parameters")
        val params = Map("int" -> "1", "palindrome" -> "sweets")
      when("parameters are posted")
        val (status, body) = http.x((host << params)) {
          case (code, _, Some(body)) => (code, EntityUtils.toString(body))
        }
      then("status is BAD Request")
        status should be(400)
      and("""body includes "sweets is not a palindrome" """)
        body should include("sweets is not a palindrome")
    }
  }
}

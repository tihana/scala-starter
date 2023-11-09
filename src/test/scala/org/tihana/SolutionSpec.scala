package org.tihana

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SolutionSpec extends AnyFlatSpec with should.Matchers {

  "solution" should "do something" in {
    1 shouldBe 1
  }

  it should "do another thing" in {
    1 should not be 0
  }
}

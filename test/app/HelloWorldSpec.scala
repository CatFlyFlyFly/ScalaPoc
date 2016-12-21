package app

import org.scalatest.WordSpec

/**
  * Created by catfly on 12/21/16.
  */
class HelloWorldSpec extends WordSpec {
  "answer" should {
    "be 42" in {
      assert(HelloWorld.answer == 42)
    }
  }
}

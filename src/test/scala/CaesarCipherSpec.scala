import org.scalatest.funsuite.AnyFunSuite
import CaesarCipher._

class CaesarCipherSpec extends AnyFunSuite {

  test("a shifted by 1 should give b") {
    assert(caesar("a", 1) == "b")
  }
  test("abcz shifted by 1 should give bcda") {
    assert(caesar("abcz", 1) == "bcda")
  }

  test("irk shifted by 13 should give vex") {
    assert(caesar("irk", 13) == "vex")
  }

  test("fusion shifted by 6 should give layout") {
    assert(caesar("fusion", 6) == "layout")

  }
  test("dailyprogrammer shifted by 6 should give jgorevxumxgsskx") {
    assert(caesar("dailyprogrammer", 6) == "jgorevxumxgsskx")

  }
  test("jgorevxumxgsskx shifted by 10 should give dailyprogrammer") {
    assert(caesar("jgorevxumxgsskx", 20) == "dailyprogrammer")
  }
}
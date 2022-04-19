import org.scalatest.funsuite.AnyFunSuite
import CaesarCipherWarmup._

class CaesarCipherWarmupSpec extends AnyFunSuite {

  test("'a' shifted by 0 should give 'a'") {
    assert(warmup('a', 0) == 'a')
  }
  test("'a' shifted by 1 should give 'b'") {
    assert(warmup('a', 1) == 'b')
  }
  test("'a' shifted by 5 should give 'f'") {
    assert(warmup('a', 5) == 'f')
  }
  test("'a' shifted by 26 should give 'a'") {
    assert(warmup('a', 26) == 'a')
  }
  test("'d' shifted by 15 should give 's'") {
    assert(warmup('d', 15) == 's')
  }
  test("'z' shifted by 1 should give 'a'") {
    assert(warmup('z', 1) == 'a')
  }
  test("'q' shifted by 22 should give 'm'") {
    assert(warmup('q', 22) == 'm')
  }
}
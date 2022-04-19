object CaesarCipher {
  def caesar(s: String, n: Int): String = {
    def warmup(c: Char, offset: Int): Char = {
      if (c + offset <= 122) (c + offset).toChar
      else
        ((c + offset) - 26).toChar
    }
    s.map(warmup(_, n))
  }
}

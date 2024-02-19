class Lexer(private val input: String) {
    private var curPos = 0

    private val curChar: Char
        get() = input.getOrElse(curPos) { '$' }

    private fun take(): Char = curChar.also { ++curPos }

    private fun takeIf(pred: (Char) -> Boolean): Char? =
        if (pred(curChar)) take() else null

    private fun takeWhile(pred: (Char) -> Boolean, consumer: (Char) -> Unit = {}) {
        while (true) {
            consumer(takeIf(pred) ?: return)
        }
    }

    private fun readWhile(pred: (Char) -> Boolean) = buildString {
        takeWhile(pred, this::append)
    }

    private fun skipWS() {
        takeWhile(Char::isWhitespace)
    }

    private fun readPar(): Token? {
        return when (curChar) {
            '(' -> Token.LPAREN
            ')' -> Token.RPAREN
            else -> null
        }?.also { take() }
    }

    private fun readWord(): Token {
        return when(val word = readWhile(Char::isLetter)) {
            "and" -> Token.AND
            "or" -> Token.OR
            "xor" -> Token.XOR
            "not" -> Token.NOT
            else -> {
                if (word.length == 1) Token.ID
                else throw IllegalStateException("$word is not variable")
            }
        }
    }

    fun scan(): Token {
        if (curPos >= input.length) return Token.END
        skipWS()
        return readPar() ?: readWord()
    }
}

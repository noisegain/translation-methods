class Parser internal constructor(string: String) {
    private var lexer = Lexer(string)
    private var curToken = lexer.scan()

    private fun match(t: Token) {
        if (curToken == t) {
            curToken = lexer.scan()
        } else throw IllegalStateException("Expected $t, but got ${curToken.name}")
    }

    private fun consume(pred: Token): Boolean =
        (curToken == pred).also { if (it) next() }

    private fun next() {
        curToken = lexer.scan()
    }

    private fun e(): Node =
        Node("E", t(), es())

    private fun es(): Node =
        Node("E'").apply {
            if (consume(Token.OR)) {
                addAll(Node("OR"), t(), es())
            } else {
                addEps()
            }
        }

    private fun t(): Node =
        Node("T", f(), ts())

    private fun ts(): Node =
        Node("T'").apply {
            if (consume(Token.XOR)) {
                addAll(Node("XOR"), v(), fs())
            } else {
                addEps()
            }
        }

    private fun f(): Node =
        Node("F", v(), fs())

    private fun fs(): Node =
        Node("F'").apply {
            if (consume(Token.AND)) {
                addAll(Node("AND"), f(), ts())
            } else {
                addEps()
            }
        }

    private fun v(): Node =
        Node("V").apply {
            if (consume(Token.NOT)) {
                addAll(Node("NOT"), v())
            } else {
                addAll(p())
            }
        }

    private fun p(): Node =
        Node("P").apply {
            if (consume(Token.LPAREN)) {
                addAll(Node("("), e(), Node(")"))
                match(Token.RPAREN)
            } else {
                addAll(id())
            }
        }

    private fun id(): Node {
        match(Token.ID)
        return Node("ID")
    }

    fun parse(): Node {
        val s = e()
        match(Token.END)
        return s
    }

    companion object {
        fun safeParse(string: String): Result<Node> {
            return runCatching {
                Parser(string).parse()
            }.onFailure {
                println("$string does not belong to the grammar")
                it.printStackTrace()
            }
        }
    }
}
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ParserTest {

    private enum class Nodes(val node: String) {
        T("T"),
        TS("T'"),
        F("F"),
        FS("F'"),
        E("E"),
        ES("E'"),
    }

    private companion object {
        val EPS = Node("eps")
    }

    private fun empty(name: String) = Node(
        name,
        EPS
    )

    private val vId = Node(
        "V",
        Node(
            "P",
            Node(
                "ID",
            ),
        ),
    )

    private val fId = Node(
        "F",
        vId,
        empty(Nodes.FS.node)
    )

    private val lBr = Node("(")

    private val rBr = Node(")")

    fun parse(input: String) = Parser(input).parse()

    @Test
    fun empty() {
        val input = "a"
        assertEquals(
            Node(
                "E",
                Node(
                    "T",
                    Node(
                        "F",
                        vId,
                        empty(Nodes.FS.node)
                    ),
                    empty(Nodes.TS.node)
                ),
                empty(Nodes.ES.node)
            ),
            parse(input)
        )
    }

    @Test
    fun simpleTestOr() {
        val input = "a or b"
        assertEquals(
            Node(
                "E",
                Node(
                    "T",
                    fId,
                    empty(Nodes.TS.node)
                ),
                Node(
                    "E'",
                    Node(
                        "OR",
                    ),
                    Node(
                        "T",
                        fId,
                        empty(Nodes.TS.node)
                    ),
                    empty(Nodes.ES.node)
                ),
            ),
            parse(input)
        )
    }

    @Test
    fun simpleTestXOR() {
        val input = "a xor b"
        assertEquals(
            Node(
                "E",
                Node(
                    "T",
                    fId,
                    Node(
                        "T'",
                        Node(
                            "XOR",
                        ),
                        vId,
                        empty(Nodes.FS.node)
                    ),
                ),
                empty(Nodes.ES.node)
            ),
            parse(input)
        )
    }

    @Test
    fun simpleTestAND() {
        val input = "a and b"
        assertEquals(
            Node(
                "E",
                Node(
                    "T",
                    Node(
                        "F",
                        vId,
                        Node(
                            "F'",
                            Node(
                                "AND",
                            ),
                            fId,
                            empty(Nodes.TS.node)
                        ),
                    ),
                    empty(Nodes.TS.node)
                ),
                empty(Nodes.ES.node)
            ),
            parse(input)
        )
    }

    @Test
    fun simpleTestNOT() {
        val input = "not not a"
        assertEquals(
            Node(
                "E",
                Node(
                    "T",
                    Node(
                        "F",
                        Node(
                            "V",
                            Node(
                                "NOT",
                            ),
                            Node(
                                "V",
                                Node(
                                    "NOT",
                                ),
                                vId,
                            ),
                        ),
                        empty(Nodes.FS.node)
                    ),
                    empty(Nodes.TS.node)
                ),
                empty(Nodes.ES.node)
            ),
            parse(input)
        )
    }

    @Test
    fun simpleTestBR() {
        val input = "c and (a or b)"
        assertEquals(
            Node(
                "E",
                Node(
                    "T",
                    Node(
                        "F",
                        vId,
                        Node(
                            "F'",
                            Node(
                                "AND",
                            ),
                            Node(
                                "F",
                                Node(
                                    "V",
                                    Node(
                                        "P",
                                        lBr,
                                        Node(
                                            "E",
                                            Node(
                                                "T",
                                                Node(
                                                    "F",
                                                    Node(
                                                        "V",
                                                        Node(
                                                            "P",
                                                            Node(
                                                                "ID",
                                                            ),
                                                        ),
                                                    ),
                                                    empty(Nodes.FS.node)
                                                ),
                                                empty(Nodes.TS.node)
                                            ),
                                            Node(
                                                "E'",
                                                Node(
                                                    "OR",
                                                ),
                                                Node(
                                                    "T",
                                                    Node(
                                                        "F",
                                                        Node(
                                                            "V",
                                                            Node(
                                                                "P",
                                                                Node(
                                                                    "ID",
                                                                ),
                                                            ),
                                                        ),
                                                        empty(Nodes.FS.node)
                                                    ),
                                                    empty(Nodes.TS.node)
                                                ),
                                                empty(Nodes.ES.node)
                                            ),
                                        ),
                                        rBr,
                                    ),
                                ),
                                empty(Nodes.FS.node)
                            ),
                            empty(Nodes.TS.node)
                        ),
                    ),
                    empty(Nodes.TS.node)
                ),
                empty(Nodes.ES.node)
            ),
            parse(input)
        )
    }

    @Test
    fun complexTest1() {
        val input = "a xor (b and not (not c))"
        assertEquals(
            Node(
                "E",
                Node(
                    "T",
                    fId,
                    Node(
                        "T'",
                        Node(
                            "XOR",
                        ),
                        Node(
                            "V",
                            Node(
                                "P",
                                Node("("),
                                Node(
                                    "E",
                                    Node(
                                        "T",
                                        Node(
                                            "F",
                                            vId,
                                            Node(
                                                "F'",
                                                Node(
                                                    "AND",
                                                ),
                                                Node(
                                                    "F",
                                                    Node(
                                                        "V",
                                                        Node(
                                                            "NOT",
                                                        ),
                                                        Node(
                                                            "V",
                                                            Node(
                                                                "P",
                                                                lBr,
                                                                Node(
                                                                    "E",
                                                                    Node(
                                                                        "T",
                                                                        Node(
                                                                            "F",
                                                                            Node(
                                                                                "V",
                                                                                Node(
                                                                                    "NOT",
                                                                                ),
                                                                                Node(
                                                                                    "V",
                                                                                    Node(
                                                                                        "P",
                                                                                        Node(
                                                                                            "ID",
                                                                                        ),
                                                                                    ),
                                                                                ),
                                                                            ),
                                                                            empty(Nodes.FS.node)
                                                                        ),
                                                                        empty(Nodes.TS.node)
                                                                    ),
                                                                    empty(Nodes.ES.node)
                                                                ),
                                                                rBr,
                                                            ),
                                                        ),
                                                    ),
                                                    empty(Nodes.FS.node)
                                                ),
                                                empty(Nodes.TS.node)
                                            ),
                                        ),
                                        empty(Nodes.TS.node)
                                    ),
                                    empty(Nodes.ES.node)
                                ),
                                rBr,
                            ),
                        ),
                        empty(Nodes.FS.node)
                    ),
                ),
                empty(Nodes.ES.node)
            ),
            parse(input)
        )
    }

    @Test
    fun complexTest2() {
        val input = "not (a or b) and c and x"
        assertEquals(
            Node(
                "E",
                Node(
                    "T",
                    Node(
                        "F",
                        Node(
                            "V",
                            Node(
                                "NOT",
                            ),
                            Node(
                                "V",
                                Node(
                                    "P",
                                    lBr,
                                    Node(
                                        "E",
                                        Node(
                                            "T",
                                            fId,
                                            empty(Nodes.TS.node)
                                        ),
                                        Node(
                                            "E'",
                                            Node(
                                                "OR",
                                            ),
                                            Node(
                                                "T",
                                                fId,
                                                empty(Nodes.TS.node)
                                            ),
                                            empty(Nodes.ES.node)
                                        ),
                                    ),
                                    rBr,
                                ),
                            ),
                        ),
                        Node(
                            "F'",
                            Node(
                                "AND",
                            ),
                            Node(
                                "F",
                                vId,
                                Node(
                                    "F'",
                                    Node(
                                        "AND",
                                    ),
                                    fId,
                                    empty(Nodes.TS.node)
                                ),
                            ),
                            empty(Nodes.TS.node)
                        ),
                    ),
                    empty(Nodes.TS.node)
                ),
                empty(Nodes.ES.node)
            ),
            parse(input)
        )
    }
}
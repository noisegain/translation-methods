import java.util.UUID

class Node(val name: String, private var _children: MutableList<Node>) {

    constructor(nodeName: String, vararg nodes: Node) : this(nodeName, nodes.toMutableList())

    val isTerm: Boolean
        get() = _children.isEmpty() && name != EPS

    val children: List<Node>
        get() = buildList { addAll(_children) }

    fun addAll(vararg children: Node) {
        _children.addAll(children)
    }

    fun addEps() {
        _children += Node(EPS)
    }

    override fun toString(): String {
        val stringBuilder = StringBuilder()
        toString(stringBuilder, 0)
        return stringBuilder.toString()
    }

    private fun toString(stringBuilder: StringBuilder, ident: Int) {
        stringBuilder
            .append("    ".repeat(ident))
            .append("Node(")
            .append(System.lineSeparator())
            .append("    ".repeat(ident + 1))
            .append("\"$name\",")
            .append(System.lineSeparator())
        children.forEach { it.toString(stringBuilder, ident + 1) }
        stringBuilder
            .append("\t".repeat(ident))
            .append("),")
            .append(System.lineSeparator())
    }

    private val id = UUID.randomUUID()

    override fun hashCode() = id.hashCode()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as Node
        if (name != other.name) return false
        if (isTerm != other.isTerm) return false
        return true
    }

    companion object {
        const val EPS = "eps"
    }
}

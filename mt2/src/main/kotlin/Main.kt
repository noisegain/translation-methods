import java.io.File
import java.nio.charset.StandardCharsets

fun main() {
    val inp = "a xor (b and not (not c))"
    Parser.safeParse(inp).onSuccess(::createGraph).onSuccess { println(it) }
}

fun createGraph(graph: Node) {
    val fileName = "graph.dot"
    File(fileName).printWriter(StandardCharsets.UTF_8).use { out ->
        out.println("digraph {")
        fun dfs(node: Node) {
            out.println("\t${node.hashCode()}[label=\"${node.name}\"${if (node.isTerm) ", color=red" else ""}]")
            node.children.forEach {
                out.println("\t\"${node.hashCode()}\" -> \"${it.hashCode()}\"")
                dfs(it)
            }
        }
        dfs(graph)
        out.println("}")
    }
}

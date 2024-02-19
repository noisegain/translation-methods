import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.FileInputStream

fun main() {
    val charStream = CharStreams.fromStream(FileInputStream("main.fun"))
    val lexer = SimpleFunLexer(charStream)
    val tokens = CommonTokenStream(lexer)
    val parser = SimpleFunParser(tokens)
    SimpleFunVisitorToKotlin().visitProgram(parser.program()).also(::println)
}

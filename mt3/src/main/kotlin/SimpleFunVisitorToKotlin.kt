import SimpleFunParser.TypeContext
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.TerminalNode

class SimpleFunVisitorToKotlin : SimpleFunBaseVisitor<String>() {
    override fun visitProgram(ctx: SimpleFunParser.ProgramContext): String {
        return ctx.functionDecl().joinToString("\n") { visit(it) }
    }

    override fun visitFunctionDecl(ctx: SimpleFunParser.FunctionDeclContext): String {
        val returnType = visit(ctx.type())
        val functionName = ctx.ID().text
        val parameters = ctx.params()?.let { visit(it) } ?: ""
        val body = visit(ctx.expr())
        return "fun $functionName($parameters): $returnType = $body"
    }

    override fun visitParams(ctx: SimpleFunParser.ParamsContext): String {
        return ctx.param().joinToString(", ") { visit(it) }
    }

    override fun visitParam(ctx: SimpleFunParser.ParamContext): String {
        val type = visit(ctx.type())
        val paramName = ctx.ID().text
        return "$paramName: $type"
    }

    override fun visitExpr(ctx: SimpleFunParser.ExprContext): String {
        return when {
            ctx.OP() != null -> {
                val left = visit(ctx.expr(0))
                val right = visit(ctx.expr(1))
                val op = ctx.OP().text
                "($left $op $right)"
            }
            ctx.IF() != null -> {
                val condition = visit(ctx.expr(0))
                val thenBranch = visit(ctx.expr(1))
                val elseBranch = visit(ctx.expr(2))
                "if ($condition) $thenBranch else $elseBranch"
            }
            ctx.MATCH() != null -> {
                val matchExpr = visit(ctx.expr(0))
                val matchBody = visit(ctx.matchCases())
                "when ($matchExpr) {\n$matchBody\n}"
            }
            ctx.INVOKE() != null -> {
                val params = visit(ctx.invokeParams())
                "${ctx.ID().text}($params)"
            }
            ctx.CMP() != null -> {
                val left = visit(ctx.expr(0))
                val right = visit(ctx.expr(1))
                val op = ctx.CMP().text
                "($left $op $right)"
            }
            ctx.ID() != null -> ctx.ID().text
            ctx.INT() != null -> ctx.INT().text
            ctx.STRING() != null -> ctx.STRING().text
            ctx.BOOL() != null -> visit(ctx.BOOL())
            else -> ctx.text
        }
    }

    override fun visitInvokeParams(ctx: SimpleFunParser.InvokeParamsContext?): String {
        return ctx?.expr()?.joinToString(", ") { visit(it) } ?: ""
    }

    override fun visitMatchCases(ctx: SimpleFunParser.MatchCasesContext): String {
        val cases = ctx.matchCase().joinToString("\n  ") { visit(it) }
        val defaultCase = visit(ctx.defaultCase())
        return "  $cases\n  $defaultCase"
    }

    override fun visitMatchCase(ctx: SimpleFunParser.MatchCaseContext): String {
        val types = ctx.terms().text
        val expr = visit(ctx.expr())
        return "$types -> $expr"
    }

    override fun visitDefaultCase(ctx: SimpleFunParser.DefaultCaseContext): String {
        val expr = visit(ctx.expr())
        return "else -> $expr"
    }

    private fun mapType(type: String) = when(type) {
        "Bool" -> "Boolean"
        else -> type
    }

    override fun visit(tree: ParseTree?): String = when (tree) {
        is TypeContext -> mapType(tree.text)
        else -> super.visit(tree)
    }

    override fun visitTerminal(node: TerminalNode?): String {
        return super.visitTerminal(node)
    }
}
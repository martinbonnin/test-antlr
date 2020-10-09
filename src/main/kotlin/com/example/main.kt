package com.example

import com.example.antlr.GraphQLLexer
import com.example.antlr.GraphQLParser
import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.atn.ATNConfigSet
import org.antlr.v4.runtime.dfa.DFA
import java.util.*

fun main() {
  val parser = CharStreams.fromFileName("/Users/mbonnin/test/antlr/schema.sdl")
      .let {
        GraphQLParser(CommonTokenStream(GraphQLLexer(it)))
      }

  val document = parser.apply {
    addErrorListener(object : ANTLRErrorListener {
      override fun syntaxError(recognizer: Recognizer<*, *>?, offendingSymbol: Any?, line: Int, charPositionInLine: Int, msg: String?, e: RecognitionException?) {
        TODO("Not yet implemented")
      }

      override fun reportAmbiguity(recognizer: Parser?, dfa: DFA?, startIndex: Int, stopIndex: Int, exact: Boolean, ambigAlts: BitSet?, configs: ATNConfigSet?) {
        TODO("Not yet implemented")
      }

      override fun reportAttemptingFullContext(recognizer: Parser?, dfa: DFA?, startIndex: Int, stopIndex: Int, conflictingAlts: BitSet?, configs: ATNConfigSet?) {
        TODO("Not yet implemented")
      }

      override fun reportContextSensitivity(recognizer: Parser?, dfa: DFA?, startIndex: Int, stopIndex: Int, prediction: Int, configs: ATNConfigSet?) {
        TODO("Not yet implemented")
      }

    })
  }.document()

  println(document.interfaceTypeDefinition()?.first()?.text)
}
package pattern.basic

import pattern.PatternParser

object EndOfPattern : PatternParser() {
    override val parse: (String) -> PatternParserParseResult = { pattern ->
        when (pattern.isEmpty()) {
            true -> True.parse(pattern)

            false -> False.parse(pattern)
        }
    }
}
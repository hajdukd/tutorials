package my.simple.specs

import spock.lang.Specification

/**
 * Docs:
 * http://spockframework.org/
 * http://docs.groovy-lang.org
 */
class StringConcatenationSpec extends Specification {


    def "Should check whether String.concat() returns concatenated strings from list(no code repeats in test)"(){
        given:
        def concatMe = "concatedString"
        def strings = ["first", "second", "third"]

        // ?
    }
}
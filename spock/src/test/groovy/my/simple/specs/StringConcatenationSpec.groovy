package my.simple.specs

import spock.lang.Specification

/**
 * Learning test
 *
 * Docs http://spockframework.org/
 */
class StringConcatenationSpec extends Specification {


    def "Should check whether String.concat() returns concatenated strings from list"(){
        given:
        def concatMe = "concatedString"
        def strings = ["first", "second", "third"]

        // ?
    }
}
package my.simple.spock

import spock.lang.Specification

/**
 * Docs:
 * http://spockframework.org/
 * http://docs.groovy-lang.org
 *
 * DefaultGroovyMethods
 */
class ClosureSpec extends Specification {

    def "Should find all list elements which are similar to 'text'"() {
        given:
        def list = ["something", "teeexxxt", "this is my text", "text about something"]
        and:
        def expected = ["this is my text", "text about something"]

        when:
        def result = list.findAll { it =~ 'text' }

        then:
        result == expected
    }

    def "Should find all map elements which value contains letter 'a'"() {
        given:
        def map = [first: "mkdir", second: "cat", third: "man"]
        and:
        def expected = [second: "cat", third: "man"]

        when:
        def result = map.findAll { it.value.contains("a") }

        then:
        result == expected
    }
}
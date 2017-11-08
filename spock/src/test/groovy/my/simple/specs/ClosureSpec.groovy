package my.simple.specs

import spock.lang.Specification

/**
 * Docs:
 * http://spockframework.org/
 * http://docs.groovy-lang.org
 *
 * DefaultGroovyMethods
 */
class ClosureSpec extends Specification {

    def "Should find all elements matching String 'yey' using closures"() {
        given:
        def list = ["yey", "Yupikayey", "brakamaka"]

        when:
        def result = todo as List<String> // ?

        then:
        result == ["yey", "Yupikayey"]
    }

    def "Should invoke provided closure on all list elements"(){
        given:
        def list = ["one", "two", "three"]
        def expected = ["ONE", "TWO", "THREE"]
        and:
        def toUpper = { it -> it.toUpperCase() } // think out of the box

        when:
        def result = list todo // ?

        then:
        result == expected
    }
}
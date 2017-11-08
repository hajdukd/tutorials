package my.simple.spock

import spock.lang.Specification

/**
 * Docs:
 * http://spockframework.org/
 * http://docs.groovy-lang.org
 */
class NonSharedSpec extends Specification {

    def "First Spec"() {
        given:
        def variable = new ExpensiveToCreateResource()

        expect:
        variable != null
    }

    def "Second Spec"() {
        given:
        def variable = new ExpensiveToCreateResource()

        expect:
        variable != null
    }

    def "Third Spec"() {
        given:
        def variable = new ExpensiveToCreateResource()

        expect:
        variable != null
    }
}
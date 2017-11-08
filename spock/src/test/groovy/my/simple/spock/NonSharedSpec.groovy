package my.simple.spock

import spock.lang.Specification


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
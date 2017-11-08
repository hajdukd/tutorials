package my.simple.spock

import spock.lang.Specification

/**
 * Docs:
 * http://spockframework.org/
 * http://docs.groovy-lang.org
 */
class FeatureMethodsSpec extends Specification {

    def "Blocks"() {
        setup: // given: label is an alias for setup:, given also reads better
        def val = num

        when:
        val = 2

        then:
        val == 2

        expect:
        val == 2

        cleanup:
        val = null

        where:
        num = 1
    }

    def "Given when then"() {
        given:
        def val = 1

        when:
        val = 2

        then:
        val == 2
    }

    def "Given when then where"() {
        given:
        def val = 1

        when:
        val = val + num

        then:
        val == 2

        where:
        num = 1
    }

    def "Expect"() {
        expect:
        1 == 1
    }

    def "Expect where"() {
        expect:
        num == 1

        where:
        num = 1
    }

}
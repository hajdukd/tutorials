package my.simple.spock

import spock.lang.Specification
import spock.lang.Unroll

import static Methods.*

class TestSpec extends Specification {

    def "Should print jasio"() {
        expect:
        print 'jasio'
    }

    @Unroll
    def "Should return a cardinal for a num #number"() {
        when:
        def result = numberToCardinalNumber(number)
        //def result = numberToCardinalNumber number

        then:
        result == cardinal

        where:
        number | cardinal
        1      | "jeden"
        2      | "dwa"
        3      | "trzy"
    }
}
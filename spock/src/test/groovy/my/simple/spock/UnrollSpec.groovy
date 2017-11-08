package my.simple.spock

import spock.lang.Specification
import spock.lang.Unroll

import static SimpleMethods.concatenateOperation
import static SimpleMethods.numberToCardinalNumber
import static my.simple.spock.SimpleMethods.addOne


/**
 * Docs http://spockframework.org/
 */
class UnrollSpec extends Specification {

    @Unroll
    def "Should return a cardinal for a num #number"() {
        when:
        def result = numberToCardinalNumber(number)

        then:
        result == cardinal

        where:
        number | cardinal
        1      | "jeden"
        2      | "dwa"
        3      | "trzy"
    }

    @Unroll
    def "Should concatenate operation #numOne #operator #numTwo"() {
        when:
        def result = concatenateOperation numOne, operator, numTwo

        then:
        result == concatenatedOperation

        where:
        numOne | operator | numTwo | concatenatedOperation
        1      | "+"      | 1      | "1 + 1"
        2      | "+"      | 2      | "2 + 2"
    }

    @Unroll
    def "Should add one to all specified values in a list, running #toNum"() {
        when:
        def result = addOne toNum

        then:
        result == expected

        where:
        toNum << [0, 1, 2, 3, 4]
        expected << [1, 2, 3, 4, 5]
    }
}
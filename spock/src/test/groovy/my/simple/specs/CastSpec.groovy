package my.simple.specs

import spock.lang.Specification

/**
 * Docs:
 * http://spockframework.org/
 * http://docs.groovy-lang.org
 */
class CastSpec extends Specification {

    def "Should cast list collection to LinkedHashSet"() {
        given:
        def list = [1, 2, 3]

        when:
        list = cast // ?

        then:
        list.class == LinkedHashSet
    }

    // Groovy autoboxes every primitive type from the go

//    def "Should be able to call object methods on primitive type"() {
//        given:
//        int primitive = 1
//
//        when:
//        def result = primitive.objectmethod() // ?
//
//        then:
//        result == objectmethodresult // ?
//    }
}
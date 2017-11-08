package my.simple.specs

import spock.lang.Specification


class ExceptionsSpec extends Specification {


    def "Should throw exception when passing 'error' to the Validator"() {
        given:
        def validator = new Validator()

        when:
        todo // ?

        then:
        todo // ?
    }
}
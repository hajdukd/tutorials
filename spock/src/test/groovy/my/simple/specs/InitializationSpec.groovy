package my.simple.specs

import spock.lang.Specification

/**
 * Docs:
 * http://spockframework.org/
 * http://docs.groovy-lang.org
 */
class InitializationSpec extends Specification {

    def "Should initialize SimpleDtoObject with name 'jasio' and description 'something' and value '9000'"(){
        when:
        def result = todo

        then:
        result.name == 'jasio'
        result.description == 'something'
        result.value == 9000
    }
}
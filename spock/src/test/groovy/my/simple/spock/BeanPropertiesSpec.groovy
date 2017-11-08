package my.simple.spock

import spock.lang.Specification

/**
 * Docs:
 * http://spockframework.org/
 * http://docs.groovy-lang.org
 */
class BeanPropertiesSpec extends Specification {

    def "Should initialize simple dto using bean properties"() {
        given:
        def name = "name"
        def description = "description"
        def value = 666
        and:
        def dto = new SimpleDtoObject(
                name: name,
                description: description,
                value: value
        )

        expect:
        dto.name == name
        dto.description == description
        dto.value == value
    }

    def "Should initialize simple dto using property map"(){
        when:
        def dto = aSimpleDtoObject(name: "jasio")
        println dto

        then:
        dto.name == "jasio"
        dto.description == null
        dto.value == 0
    }

    def aSimpleDtoObject(params = [name: "default", description: "default", value: 1]) {
        new SimpleDtoObject(
                name: params.name,
                description: params.description,
                value: params.value
        )
    }
}
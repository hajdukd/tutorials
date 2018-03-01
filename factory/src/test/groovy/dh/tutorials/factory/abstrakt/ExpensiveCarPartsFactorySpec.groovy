package dh.tutorials.factory.abstrakt

import dh.tutorials.factory.abstrakt.parts.ExpensiveCarPartsFactory
import dh.tutorials.factory.abstrakt.parts.wheels.ExpensiveWheels
import spock.lang.Specification

class ExpensiveCarPartsFactorySpec extends Specification {

    def "Should check whether produced Wheel part is expensive"() {
        given:
        def factory = new ExpensiveCarPartsFactory()

        when:
        def wheels = factory.produceWheels("14")

        then:
        wheels.class == ExpensiveWheels.class
        wheels.size == "14"
    }
}
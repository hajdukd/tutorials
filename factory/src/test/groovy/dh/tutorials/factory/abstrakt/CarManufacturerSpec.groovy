package dh.tutorials.factory.abstrakt

import spock.lang.Specification


class CarManufacturerSpec extends Specification {

    def "Should init car using expensive parts factory"() {
        expect:
        Car car = new ExpensiveCar()
        car.describeYourself()
    }

    def "Should init car using cheap parts factory"() {
        expect:
        Car car = new CheapCar()
        car.describeYourself()
    }
}
package dh.tutorials.factory.simple

import dh.tutorials.factory.IPhone
import dh.tutorials.factory.Samsung
import spock.lang.Specification
import spock.lang.Unroll


class SimplePhoneFactorySpec extends Specification {

    @Unroll
    def "Should create #type phone"() {
        given:
        def factory = new SimplePhoneFactory()
        and:
        def phone = factory.createPhone(type)

        when:
        def calling = phone.call("John")

        then:
        calling == expected

        where:
        type      | expected
        "iphone"  | IPhone.CALLING + "John"
        "samsung" | Samsung.CALLING + "John"
    }

    def "Should throw IllegalArgumentException in case of unknown phone type"() {
        given:
        def factory = new SimplePhoneFactory()

        when:
        factory.createPhone("unknowntype")

        then:
        IllegalArgumentException e = thrown()
    }
}
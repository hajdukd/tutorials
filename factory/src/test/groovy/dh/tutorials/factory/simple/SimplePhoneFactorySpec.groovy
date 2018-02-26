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

        when:
        def phone = factory.createPhone(type)
        def calling = phone.call("John")

        then:
        phone.class == clazz
        calling == expected

        where:
        type      | clazz         | expected
        "iphone"  | IPhone.class  | IPhone.CALLING + "John"
        "samsung" | Samsung.class | Samsung.CALLING + "John"
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
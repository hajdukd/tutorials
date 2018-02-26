package dh.tutorials.factory.method

import dh.tutorials.factory.IPhone
import dh.tutorials.factory.Samsung
import spock.lang.Specification
import spock.lang.Unroll

class PhoneFactorySpec extends Specification {


    @Unroll
    def "Should create specific phone using provided PhoneFactory"() {
        given:
        // this could be for example instantiating new client with specific factory implementation (like new PhoneStore(factory))
        PhoneFactory factory = provideFactory()
        def phone = factory.createPhone()

        when:
        def calling = phone.call("John")

        then:
        calling == expected

        where:
        expected                 | provideFactory
        IPhone.CALLING + "John"  | { -> new IPhoneFactory() }
        Samsung.CALLING + "John" | { -> new SamsungFactory() }
    }
}
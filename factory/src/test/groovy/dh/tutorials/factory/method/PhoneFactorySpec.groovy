package dh.tutorials.factory.method

import dh.tutorials.factory.IPhone
import dh.tutorials.factory.Samsung
import spock.lang.Specification
import spock.lang.Unroll

class PhoneFactorySpec extends Specification {


    @Unroll
    def "Should create specific phone using provided PhoneFactory"() {
        //the client is the PhoneFactory and object instantiation responsibility is moved to subclasses
        given:
        PhoneFactory factory = provideFactory()

        when:
        def calling = factory.qualityTestCall("John")

        then:
        calling == expected

        where:
        expected                 | provideFactory
        IPhone.CALLING + "John"  | { -> new IPhoneFactory() }
        Samsung.CALLING + "John" | { -> new SamsungFactory() }
    }
}
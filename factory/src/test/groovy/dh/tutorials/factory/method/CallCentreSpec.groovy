package dh.tutorials.factory.method

import dh.tutorials.factory.IPhone
import dh.tutorials.factory.Samsung
import spock.lang.Specification
import spock.lang.Unroll

class CallCentreSpec extends Specification {


    @Unroll
    def "Should create specific phone using provided PhoneFactory"() {
        //the client is the CallCentre and object instantiation responsibility is moved to subclasses
        given:
        CallCentre factory = provideCallCentre()

        when:
        def calling = factory.qualityTestCall("John")

        then:
        calling == expected

        where:
        expected                 | provideCallCentre
        IPhone.CALLING + "John"  | { -> new IPhoneCallCentre() }
        Samsung.CALLING + "John" | { -> new SamsungCallCentre() }
    }
}
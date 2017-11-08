package my.simple.spock

import my.simple.specs.Participant
import spock.lang.Specification

/**
 * Docs:
 * http://spockframework.org/
 * http://docs.groovy-lang.org
 */
class MockingSpec extends Specification {

    def "Should mock participant interface to greet with 'Hello, Im Mike'"(){
        given:
        def mock = Mock(Participant)
        and:
        def greeting = "Hello, Im Mike"
        and:
        mock.sayHello() >> greeting

        when:
        def result = mock.sayHello()

        then:
        result == greeting
    }

//    def "Should mock composition object and change mocked object method"() {
//        given:
//        def mock = Mock(MockMe)
//        and:
//        def composed = new ComposeMockMe(mock)
//        and:
//        def mockedResult = "mocked method"
//        and:
//        mock.method() >> mockedResult
//
//        when:
//        def result = composed.invokeMockMeMethod()
//
//        then:
//        result == mockedResult
//    }

//    def "Should spy on composition object and change mocked object method with parameter counting invocations"(){
//        given:
//        def spy = Spy(MockMe)
//        and:
//        def composed = new ComposeMockMe(spy)
//        and:
//        def mockedResult = "mocked method"
//
//        when:
//        def result = composed.invokeMockMeMethod(1)
//
//        then:
//        1 * spy.method(_ as Integer) >> mockedResult
//        result == mockedResult
//    }
}
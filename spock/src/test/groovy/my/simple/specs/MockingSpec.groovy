package my.simple.specs

import spock.lang.Specification

/**
 * Docs:
 * http://spockframework.org/
 * http://docs.groovy-lang.org
 */
class MockingSpec extends Specification {

    def "Should return 'Im a happy little cloud' when Meeting greeting happens"(){
        given:
        def greeting = 'Im a happy little cloud'
        and:
        def meeting = todo // ?

        when:
        def result = meeting.greetings()

        then:
        result == greeting
    }

    def "Should return default participants list and 'Im a happy little cloud' when Meeting greeting happens"(){
        given:
        def greeting = 'Im a happy little cloud'
        and:
        def meeting = todo // ?

        when:
        def participants = meeting.getMeetingParticipants() as List<Participant>
        def result = meeting.greetings()

        then:
        participants.
        result == greeting
    }
}
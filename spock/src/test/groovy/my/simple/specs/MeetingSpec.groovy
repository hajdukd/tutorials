package my.simple.specs

import spock.lang.Specification

/**
 * Learning test
 *
 * Docs http://spockframework.org/
 */
class MeetingSpec extends Specification {

    def moderator = new Meeting()

    def "Should check that Daniel, Lukasz and Pawel are all participating in a meeting"() {
        // ?
    }

    def "Should check whether the moderator is present during greetings"() {
        // ?
    }


}
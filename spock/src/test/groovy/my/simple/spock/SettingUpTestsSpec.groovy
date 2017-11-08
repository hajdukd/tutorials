package my.simple.spock

import spock.lang.Specification


class SettingUpTestsSpec extends Specification {

    def setup(){
        println "setup"
    }

    def cleanup(){
        println "cleanup"
    }

    def setupSpec(){
        println "setupSpec"
    }

    def cleanupSpec(){
        println "cleanupSpec"
    }

    def 'Very important test'(){
        expect:
        println "Very important test"
    }
}
package my.simple.spock

import spock.lang.Specification

/**
 * Docs:
 * http://spockframework.org/
 * http://docs.groovy-lang.org
 */
class FixtureMethodsSpec extends Specification {

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

    def 'Test Specification'(){
        expect:
        println "Test Specification"
    }

//    def 'Test Other Specification'(){
//        expect:
//        println "Test Other Specification"
//    }
}
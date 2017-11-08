package my.simple.spock

import spock.lang.Shared
import spock.lang.Specification


class SharedSpec extends Specification {

    /**
     * Only @Shared and static variables can be accessed from within a where: block.
     * Mock objects should not be stored in static or @Shared fields!
     *
     * This is still a instance variable
     */
    @Shared
    def instanceVariable = new ExpensiveToCreateResource()

    def "First Spec"() {
        expect:
        instanceVariable != null
    }

    def "Second Spec"() {
        expect:
        instanceVariable != null
    }

    def "Third Spec"() {
        expect:
        instanceVariable != null
    }

//    static void test(){
//        instanceVariable = null
//    }
}
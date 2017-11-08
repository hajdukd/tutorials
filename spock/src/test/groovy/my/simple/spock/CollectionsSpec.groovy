package my.simple.spock

import org.codehaus.groovy.runtime.typehandling.GroovyCastException
import spock.lang.Specification

/**
 * Docs:
 * http://spockframework.org/
 * http://docs.groovy-lang.org
 */
class CollectionsSpec extends Specification {

    def "Should check whether java and groovy list are equal"() {
        expect:
        javaList() equals groovyList()
    }

    def "Should check whether the java and groovy list are equal using '==' operator"() {
        expect:
        javaList() == groovyList()
    }

    def "Should check whether the java listList IS groovyList"() {
        expect:
        javaList() is groovyList()
    }

    def "Should check whether the java and groovy map are equal"() {
        expect:
        javaMap() equals groovyMap()
    }

    def "Should check whether the java and groovy map are equal using '==' operator"() {
        expect:
        javaMap() == groovyMap()
    }

    def "Should check whether the java listMap IS groovyMap"() {
        expect:
        javaMap() is groovyMap()
    }

    def "Should correctly cast a list to a set using groovy AS operator"() {
        given:
        def list = [1, 2, 3, 4, 4, 4]
        println "Im really a: " + list.class.simpleName

        when:
        def set = list as HashSet
        println "Now im really a:" + set.class.simpleName

        then:
        set != list
        set == [1, 2, 3, 4] as HashSet
    }

    def "Should correctly cast a list to a set using groovy collection operations"() {
        given:
        def list = [1, 2, 3, 4, 4, 4]
        println "Im really a: " + list.class.simpleName

        when:
        def set = list.toSet()
        println "Now im really a:" + set.class.simpleName

        then:
        set != list
        set == [1, 2, 3, 4] as HashSet
    }

    def "Should fail to cast a list to a map"() {
        given:
        def list = [1, 2, 3]

        when:
        def map = list as HashMap

        then:
        GroovyCastException e = thrown()
    }


    List<Integer> javaList() {
        final List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        return list;
    }

    def groovyList() {
        [1, 2, 3]
    }

    static Map<String, String> javaMap() {
        final Map<String, String> map = new Hashtable<>()
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        return map
    }

    def static groovyMap() {
        ["1": "one", "2": "two", "3": "three"]
    }
}
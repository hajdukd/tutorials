package my.simple.spock;

/**
 * Docs:
 * http://spockframework.org/
 * http://docs.groovy-lang.org
 */
class MockMe {

    String method() {
        return "real method";
    }

    String method(final Integer parameter) {
        return "real method " + parameter;
    }
}

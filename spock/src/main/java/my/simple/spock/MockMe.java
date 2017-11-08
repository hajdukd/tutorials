package my.simple.spock;

/**
 * Docs http://spockframework.org/
 */
class MockMe {

    String method() {
        return "real method";
    }

    String method(final Integer parameter) {
        return "real method " + parameter;
    }
}

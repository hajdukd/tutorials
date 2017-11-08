package my.simple.spock;

/**
 * Docs:
 * http://spockframework.org/
 * http://docs.groovy-lang.org
 */
class ComposeMockMe {

    private final MockMe mockMe;

    ComposeMockMe(final MockMe mockMe) {
        this.mockMe = mockMe;
    }

    String invokeMockMeMethod() {
        return mockMe.method();
    }

    String invokeMockMeMethod(final Integer parameter) {
        return mockMe.method(parameter);
    }
}

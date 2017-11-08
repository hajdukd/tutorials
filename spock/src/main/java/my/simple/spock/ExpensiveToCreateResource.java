package my.simple.spock;

/**
 * Docs:
 * http://spockframework.org/
 * http://docs.groovy-lang.org
 */
class ExpensiveToCreateResource {

    public ExpensiveToCreateResource() {
        try {
            Thread.sleep(5000);
        } catch (final Exception e) {
            // ignore :))
        }
    }
}

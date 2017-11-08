package my.simple.spock;

class ExpensiveToCreateResource {

    public ExpensiveToCreateResource() {
        try {
            Thread.sleep(5000);
        } catch (final Exception e) {
            // ignore :))
        }
    }
}

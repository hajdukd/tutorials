package my.simple.spock;

/**
 * Docs:
 * http://spockframework.org/
 * http://docs.groovy-lang.org
 */
class SimpleDtoObject {

    String name;
    String description;
    Integer value;

    @Override
    public String toString() {
        return "name:" + name + ", description:" + description + ", " + description + ", value:" + value;
    }
}

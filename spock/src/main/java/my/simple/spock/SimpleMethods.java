package my.simple.spock;

import static java.lang.String.format;

/**
 * Docs:
 * http://spockframework.org/
 * http://docs.groovy-lang.org
 */
class SimpleMethods {

    static final String NOT_SUPPORTED = "Numbers other than 1,2,3 are not supported!";

    static String numberToCardinalNumber(final int number) {
        switch (number) {
            case 1:
                return "jeden";
            case 2:
                return "dwa";
            case 3:
                return "trzy";
            default:
                throw new IllegalArgumentException(NOT_SUPPORTED);
        }
    }

    static String concatenateOperation(final Integer numOne, final String operator, final Integer numTwo) {

        return format("%s %s %s", numOne.toString(), operator, numTwo.toString());
    }

    static Integer addOne(final Integer to) {
        return to + 1;
    }
}

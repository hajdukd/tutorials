package my.simple.spock;

/**
 * Collection of simple methods for spock testing example
 */
class Methods {

    static final String NOT_SUPPORTED = "Numbers other than 1,2,3 are not supported!";

    static String numberToCardinalNumber(final int number){
        switch(number){
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


}

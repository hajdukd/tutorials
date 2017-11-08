package my.simple.specs;

class Validator {

    static final String ERROR = "Error is not acceptable!";

    static boolean validate(final String str) {
        if ("test".equalsIgnoreCase(str)) {
            return false;
        }
        if ("error".equalsIgnoreCase(str)) {
            throw new IllegalArgumentException(ERROR);
        }
        return true;
    }
}

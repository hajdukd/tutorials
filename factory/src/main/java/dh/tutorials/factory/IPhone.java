package dh.tutorials.factory;

public class IPhone implements Phone {

    public static final String CALLING = "Be grateful mortal i owner of IPhone called you - ";

    @Override
    public String call(final String someone) {
        final String calling = CALLING + someone;
        System.out.println(calling);
        return calling;
    }
}

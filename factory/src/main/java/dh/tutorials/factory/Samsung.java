package dh.tutorials.factory;

public class Samsung implements Phone {

    public static final String CALLING = "I hope IPhone senpai will notice me - calling ";

    @Override
    public String call(final String someone) {
        final String calling = CALLING + someone;
        System.out.println(calling);
        return calling;
    }
}

package dh.tutorials.factory.abstrakt;

import dh.tutorials.factory.IPhone;

public class IPhone5S extends IPhone {

    public static final String CALLING = "What troubles do you bring now? - ";

    @Override
    public String call(
        final String someone) {
        return CALLING + someone;
    }
}

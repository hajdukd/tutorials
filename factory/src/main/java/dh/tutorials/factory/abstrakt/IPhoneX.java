package dh.tutorials.factory.abstrakt;

import dh.tutorials.factory.IPhone;

public class IPhoneX extends IPhone {

    public static final String CALLING = "Do you know a true face of GOD exile? - ";

    @Override
    public String call(
        final String someone) {
        return CALLING + someone;
    }
}

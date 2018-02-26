package dh.tutorials.factory.simple;

import dh.tutorials.factory.IPhone;
import dh.tutorials.factory.Phone;
import dh.tutorials.factory.Samsung;

public class SimplePhoneFactory {

    public Phone createPhone(final String type) {
        if ("iphone".equalsIgnoreCase(type)) {
            return new IPhone();
        } else if ("samsung".equalsIgnoreCase(type)) {
            return new Samsung();
        }
        throw new IllegalArgumentException("Unknown phone type:" + type);
    }
}

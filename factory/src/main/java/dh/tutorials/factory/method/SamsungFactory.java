package dh.tutorials.factory.method;

import dh.tutorials.factory.Phone;
import dh.tutorials.factory.Samsung;

public class SamsungFactory implements PhoneFactory {

    @Override
    public Phone createPhone() {
        return new Samsung();
    }
}

package dh.tutorials.factory.abstrakt;

import dh.tutorials.factory.IPhone;
import dh.tutorials.factory.Samsung;

public class NoMunehPhoneFactory implements PhoneFactory {

    @Override
    public IPhone createIPhonePhone() {
        return new IPhone5S();
    }

    @Override
    public Samsung createSamsungPhone() {
        return new GalaxyS5();
    }
}

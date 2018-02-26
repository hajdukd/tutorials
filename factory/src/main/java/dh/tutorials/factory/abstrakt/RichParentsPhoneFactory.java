package dh.tutorials.factory.abstrakt;

import dh.tutorials.factory.IPhone;
import dh.tutorials.factory.Samsung;

public class RichParentsPhoneFactory implements PhoneFactory {

    @Override
    public IPhone createIPhonePhone() {
        return new IPhoneX();
    }

    @Override
    public Samsung createSamsungPhone() {
        return new GalaxyS9Plus();
    }
}

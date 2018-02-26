package dh.tutorials.factory.abstrakt;


import dh.tutorials.factory.IPhone;
import dh.tutorials.factory.Samsung;

public interface PhoneFactory {

    IPhone createIPhonePhone();

    Samsung createSamsungPhone();
}

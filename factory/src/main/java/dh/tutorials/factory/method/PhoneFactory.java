package dh.tutorials.factory.method;

import dh.tutorials.factory.Phone;

public abstract class PhoneFactory {

    public String qualityTestCall(
        final String someone) {
        final Phone phone = createPhone();
        return phone.call(someone);
    }

    public abstract Phone createPhone();
}

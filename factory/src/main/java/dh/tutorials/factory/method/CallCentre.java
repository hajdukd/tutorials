package dh.tutorials.factory.method;

import dh.tutorials.factory.Phone;

public abstract class CallCentre {

    public String qualityTestCall(
        final String someone) {
        final Phone phone = createPhone();
        return phone.call(someone);
    }

    public abstract Phone createPhone();
}

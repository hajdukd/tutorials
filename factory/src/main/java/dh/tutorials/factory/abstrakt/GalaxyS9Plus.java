package dh.tutorials.factory.abstrakt;

import dh.tutorials.factory.Samsung;

public class GalaxyS9Plus extends Samsung {

    public static final String CALLING = "I fight for the GOD, who do you fight for? - ";

    @Override
    public String call(
        final String someone) {
        return CALLING + someone;
    }
}

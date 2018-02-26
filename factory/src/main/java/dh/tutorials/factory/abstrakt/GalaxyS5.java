package dh.tutorials.factory.abstrakt;

import dh.tutorials.factory.Samsung;

public class GalaxyS5 extends Samsung {

    public static final String CALLING = "It all is just a dust in the wind. - ";

    @Override
    public String call(
        final String someone) {
        return CALLING + someone;
    }
}

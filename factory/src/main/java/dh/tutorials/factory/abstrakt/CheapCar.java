package dh.tutorials.factory.abstrakt;

import dh.tutorials.factory.abstrakt.parts.CheapCarPartsFactory;

public class CheapCar extends Car {

    public CheapCar() {
        super(new CheapCarPartsFactory());
    }
}

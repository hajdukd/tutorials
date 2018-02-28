package dh.tutorials.factory.abstrakt;

import dh.tutorials.factory.abstrakt.parts.ExpensiveCarPartsFactory;

public class ExpensiveCar extends Car {

    public ExpensiveCar() {
        super(new ExpensiveCarPartsFactory());
    }
}

package dh.tutorials.factory.abstrakt.parts;

import dh.tutorials.factory.abstrakt.parts.body.Body;
import dh.tutorials.factory.abstrakt.parts.body.ExpensiveBody;
import dh.tutorials.factory.abstrakt.parts.chessis.Chassis;
import dh.tutorials.factory.abstrakt.parts.chessis.ExpensiveChassis;
import dh.tutorials.factory.abstrakt.parts.engine.Engine;
import dh.tutorials.factory.abstrakt.parts.engine.ExpensiveEngine;
import dh.tutorials.factory.abstrakt.parts.wheels.ExpensiveWheels;
import dh.tutorials.factory.abstrakt.parts.wheels.Wheels;

public class ExpensiveCarPartsFactory implements CarPartsFactory {

    @Override
    public Wheels produceWheels(String size) {
        ExpensiveWheels wheels =  new ExpensiveWheels();
        wheels.setSize(size);
        return wheels;
    }

    @Override
    public Body produceBody() {
        return new ExpensiveBody();
    }

    @Override
    public Chassis produceChassis() {
        return new ExpensiveChassis();
    }

    @Override
    public Engine produceEngine() {
        return new ExpensiveEngine();
    }
}

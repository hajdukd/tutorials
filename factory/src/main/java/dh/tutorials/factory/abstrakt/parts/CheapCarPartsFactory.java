package dh.tutorials.factory.abstrakt.parts;

import dh.tutorials.factory.abstrakt.parts.body.Body;
import dh.tutorials.factory.abstrakt.parts.body.CheapBody;
import dh.tutorials.factory.abstrakt.parts.chessis.Chassis;
import dh.tutorials.factory.abstrakt.parts.chessis.CheapChassis;
import dh.tutorials.factory.abstrakt.parts.engine.CheapEngine;
import dh.tutorials.factory.abstrakt.parts.engine.Engine;
import dh.tutorials.factory.abstrakt.parts.wheels.CheapWheels;
import dh.tutorials.factory.abstrakt.parts.wheels.Wheels;

public class CheapCarPartsFactory implements CarPartsFactory {

    @Override
    public Wheels produceWheels() {
        return new CheapWheels();
    }

    @Override
    public Body produceBody() {
        return new CheapBody();
    }

    @Override
    public Chassis produceChassis() {
        return new CheapChassis();
    }

    @Override
    public Engine produceEngine() {
        return new CheapEngine();
    }
}

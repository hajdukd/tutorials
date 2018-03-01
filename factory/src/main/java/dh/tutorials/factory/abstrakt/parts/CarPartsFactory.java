package dh.tutorials.factory.abstrakt.parts;

import dh.tutorials.factory.abstrakt.parts.body.Body;
import dh.tutorials.factory.abstrakt.parts.chessis.Chassis;
import dh.tutorials.factory.abstrakt.parts.engine.Engine;
import dh.tutorials.factory.abstrakt.parts.wheels.Wheels;

public interface CarPartsFactory {

    Wheels produceWheels(String size);

    Body produceBody();

    Chassis produceChassis();

    Engine produceEngine();
}

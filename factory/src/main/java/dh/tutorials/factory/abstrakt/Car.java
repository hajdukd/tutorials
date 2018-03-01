package dh.tutorials.factory.abstrakt;

import dh.tutorials.factory.abstrakt.parts.CarPartsFactory;
import dh.tutorials.factory.abstrakt.parts.body.Body;
import dh.tutorials.factory.abstrakt.parts.chessis.Chassis;
import dh.tutorials.factory.abstrakt.parts.engine.Engine;
import dh.tutorials.factory.abstrakt.parts.wheels.Wheels;

import java.util.StringJoiner;

abstract class Car {

    private final CarPartsFactory factory;

    private Body body;
    private Wheels wheels;
    private Chassis chassis;
    private Engine engine;

    protected Car(
        final CarPartsFactory factory) {
        this.factory = factory;
        this.initCar();
    }

    private Car initCar() {
        this.body = factory.produceBody();
        this.wheels = factory.produceWheels("12");
        this.engine = factory.produceEngine();
        this.chassis = factory.produceChassis();
        return this;
    }

    public void describeYourself(){
        final StringJoiner joiner = new StringJoiner("\n");
        joiner.add(body.operation());
        joiner.add(wheels.operation());
        joiner.add(engine.operation());
        joiner.add(chassis.operation());
        System.out.println(joiner.toString());
    }
}

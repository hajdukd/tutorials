package dh.tutorials.factory.abstrakt.parts;

public interface CarPart {

    default String operation() {
        return this.getClass()
            .getSimpleName();
    }
}

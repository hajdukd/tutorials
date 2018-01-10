package my.simple.factory;

import my.simple.factory.products.Car;
import my.simple.factory.products.Computer;
import my.simple.factory.products.Phone;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public abstract class AProductFactory {

    private static Map<String, Supplier<Product>> builders = new HashMap<>();
    static {
        builders.put("car", () -> new Car());
        builders.put("phone", () -> new Phone());
        builders.put("computer", () -> new Computer());
    }


    private AProductFactory() {
        // left on purpose
    }

    public static Product createProduct(final String productType) {
        // more or less it all comes down to how clever builder selection implementation is
        if ("phone".equalsIgnoreCase(productType)) {
            return new Phone();
        } else if ("car".equalsIgnoreCase(productType)) {
            return new Car();
        } else if ("computer".equalsIgnoreCase(productType)) {
            return new Computer();
        }
        throw new IllegalArgumentException("Invalid product type!");
    }

    public static Product createProductMap(final String productType){
        if(builders.containsKey(productType)){
            return builders.get(productType).get();
        }
        throw new IllegalArgumentException("Invalid product type!");
    }
}

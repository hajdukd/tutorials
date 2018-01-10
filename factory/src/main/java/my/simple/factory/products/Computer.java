package my.simple.factory.products;

import my.simple.factory.Product;

public  class Computer implements Product{

    @Override
    public String describeProduct() {
        return "I am a Computer!";
    }
}

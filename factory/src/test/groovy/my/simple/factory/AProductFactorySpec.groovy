package my.simple.factory

import spock.lang.Specification
import spock.lang.Unroll

import static AProductFactory.createProduct
import static AProductFactory.createProductMap


class AProductFactorySpec extends Specification {

    @Unroll
    def "Should correctly build product based on #productType"() {
        when:
        def product = createProduct(productType)

        then:
        product.describeProduct() == expected

        where:
        productType | expected
        'car'       | "I am a Car!"
        'computer'  | "I am a Computer!"
        'phone'     | "I am a Phone!"
    }

    @Unroll
    def "Should correctly build product based on #productType using builders"() {
        when:
        def product = createProductMap(productType)

        then:
        product.describeProduct() == expected

        where:
        productType | expected
        'car'       | "I am a Car!"
        'computer'  | "I am a Computer!"
        'phone'     | "I am a Phone!"
    }

    def "Should fail to build product with IllegalStateException when passed invalid productType"(){
        when:
        def product = createProduct()

        then:
        IllegalStateException e = thrown()
    }
}
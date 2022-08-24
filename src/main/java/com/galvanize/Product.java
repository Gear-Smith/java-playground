package com.galvanize;

import java.util.Currency;

public class Product {
    Product(String name, int valueInCents) {
        this.name = name;
        this.valueInCents = valueInCents;
    }

    private String name;
    private int valueInCents;

    public String getName() {
        return name;
    }

    public int getValueInCents() {
        return valueInCents;
    }

    //declare your class here
    static class Currency {
        private Product product;

        public Currency(Product product) {
            this.product = product;
        }

        public String getUSD(){
            int value = product.valueInCents / 100;

            return String.format("$%.2f", value); // %.2f will format value at .00
        }
    }

    public Currency getCurrency(){
        return new Currency(this);
    }

}

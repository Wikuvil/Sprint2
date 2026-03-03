package model;

import model.constants.Discount;

import static model.constants.Colour.RED_APPLE;

public class Apple extends Food {
    private final String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price);
        this.colour = colour;
        this.isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        if (RED_APPLE.equals(colour)) {
            return Discount.RED_APPLE_DISCOUNT;
        }
        return 0;
    }
}

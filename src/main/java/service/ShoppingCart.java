package service;

import model.Apple;
import model.Food;

public class ShoppingCart {
    private final Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getCartTotalWithoutDiscount() {
        double price = 0;
        for (Food food : foods) {
            price = price + food.getPrice() * food.getAmount();
        }
        return price;
    }

    public double getCartTotalWithDiscount() {
        double price = 0;
        for (Food food : foods) {
            double productPrice = food.getPrice() * food.getAmount();
            if (food instanceof Apple) {                 // проверка типа
                Apple apple = (Apple) food;
                double discount = apple.getDiscount();
                if (discount > 0) {
                    productPrice = productPrice * (100 - discount) / 100;
                }
            }
            price = price + productPrice;
        }
        return price;
    }

    public double getVegetarianProductsTotalWithoutDiscount() {
        double price = 0;
        for (Food food : foods) {
            if (food.isVegetarian()) {
                price = price + food.getPrice() * food.getAmount();
            }
        }
        return price;
    }

}

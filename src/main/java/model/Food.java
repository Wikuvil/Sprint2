package model;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    // Конструктор для классов Meat и Apple
    protected Food(int amount, double price) {
        this.amount = amount;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
}

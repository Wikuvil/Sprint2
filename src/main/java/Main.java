import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple appleRed = new Apple(10, 50, Colour.RED_APPLE);
        Apple appleGreen = new Apple(8, 60, Colour.GREEN_APPLE);

        Food[] foods = {meat, appleRed, appleGreen};
        ShoppingCart cart = new ShoppingCart(foods);

        System.out.println("Общая сумма всех товаров в корзине без скидки: " + cart.getCartTotalWithoutDiscount());
        System.out.println("Общая сумма всех товаров в корзине со скидкой: " + cart.getCartTotalWithDiscount());
        System.out.println("Общая сумма всех вегетарианских продуктов в корзине без скидки: " + cart.getVegetarianProductsTotalWithoutDiscount());
    }
}
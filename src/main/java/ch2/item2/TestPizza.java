package ch2.item2;

public class TestPizza {
    public static void main(String[] args) {
        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL).addTopping(Pizza.Topping.SAUSAGE).addTopping(Pizza.Topping.ONION).build();
        Calzone calzone = new Calzone.Builder().sauceInside().addTopping(Pizza.Topping.HAM).build();
    }
}

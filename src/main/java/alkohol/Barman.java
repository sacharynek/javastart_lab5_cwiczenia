package alkohol;

public class Barman {

    public static void main(String[] args) {
        Drink long_island_ice_tea = new Drink("Long Island Ice Tea", 19.90, true);
        Drink piccolo = new Drink("Piccolo", 9.99, false);

        Person teenager = new Person("Edek", "Sztacheta", 16);
        Person adult = new Person("Pamela", "Anderson", 48);

        teenager.orderDrink(long_island_ice_tea);
        teenager.orderDrink(piccolo);

        adult.orderDrink(long_island_ice_tea);
        adult.orderDrink(piccolo);
    }

}

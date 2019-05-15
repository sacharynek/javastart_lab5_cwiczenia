package alkohol;

public class Drink {

    String name;
    double price;
    boolean hasAlco;

    public Drink(String name, double price, boolean hasAlco) {
        this.name = name;
        this.price = price;
        this.hasAlco = hasAlco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHasAlco() {
        return hasAlco;
    }

    public void setHasAlco(boolean hasAlco) {
        this.hasAlco = hasAlco;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", hasAlco=" + hasAlco +
                '}';
    }
}

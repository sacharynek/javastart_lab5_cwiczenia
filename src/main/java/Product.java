public class Product {

    String name, producer,  category;
    double price;

    public Product(String name, String producer, String category, double price) {
        this.name = name;
        this.producer = producer;
        this.category = category;
        this.price = price;
    }

    public Product(String name, String producer, String category) {
        this(name, producer, category, 0.0);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}

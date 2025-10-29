package ProductComparision;

public class ProductComparable implements Comparable<ProductComparable> {
    private String name;
    private double price;

    public ProductComparable(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {return name;}
    public double getPrice() {return price;}

    @Override
    public int compareTo(ProductComparable other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
}

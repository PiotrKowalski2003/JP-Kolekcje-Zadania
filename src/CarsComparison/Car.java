package CarsComparison;


public class Car {
    private String brand;
    private String model;
    private int year;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Getters
    public String getBrand() {return brand;}
    public String getModel() {return model;}
    public int getYear() {return year;}


    @Override
    public String toString() {
        return "[ " + brand + ", " + model + ", " + year + " ]";
    }


}

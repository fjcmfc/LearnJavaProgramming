
public class Car {

    private String make;
    private double price;
    private int year;
    private String color;

    public Car(String make, double price, int year, String color) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
    }

    public String getMake(){return make;}
    public double getPrice(){return price;}
    public int getYear(){return year;}
    public String getColor(){return color;}

    public void setMake(String make) {this.make = make;}
    public void setPrice(double price) {this.price = price;}
    public void setYear(int year) {this.year = year;}
    public void setColor(String color) {this.color = color;}
}

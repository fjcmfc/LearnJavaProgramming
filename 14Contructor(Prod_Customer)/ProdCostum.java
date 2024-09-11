




class Product {

    //Properties
    private Double itemNumber;
    private String designation;
    private Double price;
    private int quatity;

    //Constructor
    public Product(Double iN, String d, Double p, int q){
        setitemNumber(iN);
        setdesignation(d);
        setprice(p);
        setquatity(q);
    }

    // Getters and Setters ++++++++++++
    //itemNumber
    public void setitemNumber(Double iN){
        itemNumber = iN;
    }
    public Double getitemNumber(){
        return itemNumber;
    }
    //name
    public void setdesignation(String d){
        designation = d;
    }
    public String getdesignation(){
        return designation;
    }
    //price
    public void setprice(double p){
        price = p;
    }
    public double getprice(){
        return price;
    }
    //quantity
    public void setquatity(int q){
        quatity = q;
    }
    public int getquatity(){
        return quatity;
    }
    // Getters and Setters -----------

    // Methods
    public double valueStore() {
        return price * quatity;
    }
    public String toString() {
        return "Product data - Item Number: " + itemNumber + " / Designation: " + designation + " / Price: " + price + " / Quantity: " + quatity;
    }
}

public class ProdCostum {

    public static void main(String[] args) {

        String CurrencySymbol = "€";

        //Product data *****************************************
        Product p1 = new Product(1000.0, "Bola", 10.99, 100);
        Product p2 = new Product(1001.0, "Chapéu", 9.99, 50);
        
        //Product p1 *****************************************
        System.out.println("\nProduct 1");
        System.out.println("Dados product: " + p1.getitemNumber());
        System.out.println("\n" + p1);

        System.out.println("Volume in store: " + p1.valueStore() + CurrencySymbol);


        //Product p2 *****************************************
        System.out.println("\nProduct 2");
        System.out.println("Dados product: " + p2.getitemNumber());
        System.out.println("\n" + p2);

        System.out.println("Volume in store: " + p2.valueStore() + CurrencySymbol);

        System.out.println("");
    }
}

public class Main{

    public static void main(String[] args) {
        Car nissan = new Car();
        nissan.make = "Nissan";
        nissan.price = 10000;
        nissan.year = 2020;
        nissan.color = "Green";

        Car dodge = new Car();
        dodge.make = "Dodge";
        dodge.price = 11000;
        dodge.year = 2019;
        dodge.color = "Blue";

        Person frederico = new Person();
        frederico.name = "Frederico Carvalho";
        frederico.nationality = "Portuguesa";
        frederico.dateOfBirth = "10/20/1998";
        frederico.passport = new String[] {frederico.name, frederico.nationality, frederico.dateOfBirth};
        frederico.seatNumber = 23;
        
        System.out.println(frederico.name + " - " + frederico.nationality + " - " + frederico.dateOfBirth + " - " + frederico.passport + " - " + frederico.seatNumber);
        System.out.print("xxxxxxx: ");
        for (String pass : frederico.passport){
            System.out.print(pass + " ");
        }

        System.out.println("This " + nissan.make + " is worth $" + nissan.price + ". It was built in " + nissan.year + ". It is " + nissan.color + ".\n");

        System.out.println("This " + dodge.make + " is worth $" + dodge.price + ". It was built in " + dodge.year + ". It is " + dodge.color + ".\n");
    }
}
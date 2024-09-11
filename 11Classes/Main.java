public class Main{
    public static void main(String[] args) {
        
        Person joao = new Person("João", 1.99, 1999, "Portuguese");
        Person fred = new Person("Fred", 1.67, 1960, "French");

        Car nissan = new Car("Nissan", 10000, 2020, "Green", new String[] {"Tires","Keys"});
        Car dodge = new Car("Dodge", 11000, 2021, "Blue", new String[] {"Tires","Keys"});
        Car nissan2 = new Car(nissan);

        System.out.println(nissan);
        System.out.println(dodge);
        System.out.println(nissan2);

        Car[] cars = new Car[] {
            new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
            new Car("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
            new Car("Nissan", 5000, 2017, "yellow", new String[] {"tires", "filter"}),
            new Car("Honda", 7000, 2019, "orange", new String[] {"tires", "filter"}),
            new Car("Mercedes", 12000, 2015, "jet black", new String[] {"tires", "filter", "transmission"})
        };

        Dealership dealership = new Dealership(cars);

        cars[3] = new Car("Hyundai", 7000, 2019, "orange", new String[] {"tires", "filter"});

        System.out.println("\n\nThis " + nissan.getMake() + " is worth $" + nissan.getPrice() + ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");
        System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() + ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n");

        System.out.println("This " + joao.getName() + " is worth $" + joao.getHeigth() + ". It was built in " + joao.getBirthDate() + ". It is " + joao.getNationality() + ".\n");
        System.out.println("This " + fred.getName() + " is worth $" + fred.getHeigth() + ". It was built in " + fred.getBirthDate() + ". It is " + fred.getNationality() + ".\n");
    }
}
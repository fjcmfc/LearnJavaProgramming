public class Person {
    private String name;
    private double heigth;
    private int birthDate;
    private String nationality;

     public Person(String name, double heigth, int birthDate, String nationality){
        this.name = name;
        this.heigth = heigth;
        this.birthDate = birthDate;
        this.nationality = nationality;
     }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeigth() {
        return this.heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public int getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

}

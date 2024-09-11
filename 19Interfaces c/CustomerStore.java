
interface Member{
    //All methods are public and abstract 
     public abstract void callback();
}

class Store{
    Member members[] = new Member[10];
    int count = 0;

    void register(Member m){
        members[count++] = m;
    }
    void inviteSale(){
        for (int i = 0; i < count; i++) {
            members[i].callback();
            
        }
    }
}

class Customer implements Member{
    String name;

    Customer(String n){
        name = n;
    }
    @Override
    public void callback(){
        System.out.println("I will call back Mr./Mrs. " + name);
    }
}

public class CustomerStore{

    public static void main(String[] args) {
        
        Store S = new Store();
        
        Customer C1 = new Customer("John");
        Customer C2 = new Customer("Smith");

        S.register(C1);
        S.register(C2);

        S.inviteSale();
    }
}
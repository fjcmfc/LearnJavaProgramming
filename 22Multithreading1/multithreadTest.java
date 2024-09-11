class mythread extends Thread{
    public void run(){
        int i = 1;
        while(true){
            System.out.println("Hello: " + i);
            i++;
        } 
    }
}



public class multithreadTest {
    public static void main(String[] args) {
        mythread T = new mythread();
        T.start();

        int i = 1;
        while (true) {
            System.out.println("Population: " + i);
            i++;
        }
    }
} 

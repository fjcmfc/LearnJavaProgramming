
class multithreadTest extends Thread {

    public void run(){
        int i = 1;
        while(true){
            System.out.println("Hello: " + i);
            i++;
        } 
    }


    public static void main(String[] args) {
        multithreadTest T = new multithreadTest();
        T.start();

        int i = 1;
        while (true) {
            System.out.println("Population: " + i);
            i++;
        }
    }
} 
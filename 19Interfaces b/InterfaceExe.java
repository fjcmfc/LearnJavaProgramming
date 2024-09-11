
class phone{
    public void call() {System.out.println("Phone call");}
    public void sms() {System.out.println("Phone sends SMS");}
}

interface icamera{
    void click();
    void record();
}

interface iMusicPlayer{
    void play();
    void stop();
}

class smartPhone extends phone implements icamera, iMusicPlayer{
    public void videoCall() {System.out.println("SmartPhone video calling");}
    public void click() {System.out.println("SmartPhone click");}
    public void record() {System.out.println("SmartPhone record");}
    public void play() {System.out.println("SmartPhone play music");}
    public void stop() {System.out.println("SmartPhone stop music");}
    
}

public class InterfaceExe{
   
    public static void main(String[] args) {
        
        smartPhone sp = new smartPhone();
        sp.call();
        sp.click();
        sp.play();
        sp.record();
        sp.stop();
        sp.sms();

        phone p = new smartPhone();
        p.call();
        p.sms();

        icamera ic = new smartPhone();
        ic.click();
        ic.record();

    }
}
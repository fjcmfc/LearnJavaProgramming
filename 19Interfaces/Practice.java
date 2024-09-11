



class Phone{
    void Call(){System.out.println("Method Call of Phone");}
    void SMS(){System.out.println("Method SMS of Phone");}
}

interface Camera{
    void Click();
    void Record();
}
interface MusicPlayer{
    void Play();
    void Pause();
    void STOP();
}

class Smartphone extends Phone implements Camera, MusicPlayer{

    void VideoCall(){System.out.println("videocall of Smartphone");}
    @Override
    public void Click(){System.out.println("Click of Smartphone");}
    @Override
    public void Record(){System.out.println("Record of Smartphone");}
    public void Play(){System.out.println("Record of Smartphone");}
    public void Pause(){System.out.println("Pause of Smartphone");}
    public void STOP(){System.out.println("STOP of Smartphone");}
}

public class Practice{
    public static void main(String[] args) {
        
        Phone P = new Phone();
        P.Call();
        P.SMS();

        //Camera is abstract - cannot be instantiated
        Camera C = new Camera();
        C.Click();
        C.Record();

        //MusicPlayer is abstract - cannot be instantiated
        MusicPlayer MP = new MusicPlayer();
        MP.Pause();
        MP.Play();
        MP.STOP();

        Smartphone SP = new Smartphone();
        SP.Click();
        SP.VideoCall();
        SP.Record();
        SP.Pause();
        SP.Play();
        SP.STOP();

    }
}
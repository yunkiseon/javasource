package exam;

public class LgTV implements TV{

    // 생성자, setter , 주입
    public LgTV(Speaker speaker) {
        this.speaker = speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    
    public LgTV(){
        
    }
    
    private Speaker speaker;



    @Override
    public void powerOn() {
        System.out.println("Lg TV Power On");
    }
    
    @Override
    public void powerOff() {
        System.out.println("Lg TV Power Off");
        
    }
    
    @Override
    public void volumeUp() {
        // System.out.println("Lg TV Volume Up");
        speaker.volumeUp();
        
    }

    @Override
    public void volumeDown() {
        speaker.volumeDown();
    }

    
    
    
    
}

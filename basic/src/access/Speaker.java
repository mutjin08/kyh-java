package access;

public class Speaker {
    private int volume; //외부에서 직접 접근할 수 없다
    Speaker(int volume){
        this.volume = volume;
    }
    void volumeUp(){
        if (this.volume >= 100){
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다");
        } else{
            volume+=10;
            System.out.println("음량이 +10만큼 증가합니다");
        }
    }

    void volumeDown(){
        if (this.volume >= 100){
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다");
        } else{
            volume-=10;
            System.out.println("음량이 -10만큼 감소합니다");
        }
    }

    void showVolume(){
        System.out.println("현재 음량: "+this.volume);
    }
}

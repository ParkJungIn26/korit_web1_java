package _18_Class2.Phone;

public class Phone {
    int battery;
    boolean isPowerOn;

    // 전원 켜기
    void turnOn(){
        if (battery >= 10) {
            System.out.println("배터리가 부족합니다. 전원을 켤 수 없습니다.");
            return;
        }
            isPowerOn = true;
            System.out.println("핸드폰 전원을 켭니다");
    }

    // 전원 끄기
    void turnOff() {
        isPowerOn = false;
        System.out.println("전원을 끕니다.");

    }

    // 전원이 켜져 있고, 배터리가 5% 이상일 때만 가능, 배터리 5% 소모
    void playYoutube() {
        if(!isPowerOn) {
            System.out.println("전원을 먼저 켜 주세요");
            return;
        }

        if(battery < 5) {
            System.out.println("배터리가 부족합니다 (최소 5% 필요)");
            return;
        }

        battery = 5;
        System.out.println("유튜브 시작!");

    }

    // 충전하기 (20% 충전, 최대 100%)
    void charge() {
        battery += 20;
        if (battery > 100) {
            battery = 100;
        }
        System.out.println("배터리를 충전했습니다.");
    }
}

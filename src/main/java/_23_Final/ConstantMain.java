package _23_Final;

public class ConstantMain {
    public static void main(String[] args) {

        System.out.println("게임명 : " + "Lost Ark");
        System.out.println("게임모드 : " + "카단");
        System.out.println("플레이어수 : " + 6);

        int playerLever = 18;

        // 레벨업 로직
        if(playerLever + 1 > Constant.MAX_PLAYER_COUNT) {
            System.out.println("이미 최대레벨에 도달했습니다.");
        } else {
            playerLever++;
        }


        // 물건 구입 - 금액에 따라 할인
        // 5만원 넘어가면 10프로 할인

        int price = 100000; // 사용자 입력값
        double discountPrice = 0.0; // 초기화

        if (price > Constant.DISCOUNT_THRESHOLD) {
           double discountAmount = price * Constant.DISCOUNT_RATE;
            discountPrice = price - discountAmount;
        } else {
            discountPrice = price;
        }



    }



}

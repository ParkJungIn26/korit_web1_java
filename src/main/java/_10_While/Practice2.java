package _10_While;

import java.util.Random;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        // 1. 스캐너 객체 생성
        // 2. 랜덤 객체 생성 -> 1~100
        // 3. while문을 사용하여 스캐너를 통해 정수를 입력받고, 랜덤숫자와 비교한다.
        // 작으면 "up", 크면 "down"을 출력
        // 4. 같으면 "정답입니다!" 출력하고 반복문 탈출

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num = random.nextInt(1, 101); // 1 이상, 11 미만
        int guess = 0;

        // 추측값과 랜덤값이 맞을 때 탈출 (geuss == num -> false)
        while(guess != num) {
            System.out.println("숫자 입력 > ");
            guess = scanner.nextInt();

            if (guess < num) {
                System.out.println("up");
            } else if (guess > num) {
                System.out.println("down");
            } else { // geuss == num
                System.out.println("정답입니다.");

            }

        }


    }
}

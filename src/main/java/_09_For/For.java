package _09_For;

public class For {
    public static void main(String[] args) {
        /*
        반복문 - for
        for(변수선언(초기식); 조건식; 증감식) {
            반복될 코드 작성
        }

        초기식 -> (조건식 -> 코드 실행 -> 증감식) x n
        -> 조건식 결과가 false면 for문 탈출
        */

        for(int i = 0; i < 10; i++) {
            System.out.println("Hello");
            System.out.println(i); // 0 ~ 9까지
        }

        int a = 0;
        for (; a < 5; a++) {
            System.out.println(a); // 0 ~ 4까지
        }
        System.out.println(a); // a = 5 (증감식 -> 조건 검사하고 탈출)


        // i는 1 ~ 10 범위를 가진다. 짝수만 출력
        for(int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { // 짝수 조건일 때만
                System.out.println(i);
            }
        }


        // 1~100까지 덧셈
        int sum = 0; //누적함
        for (int i = 1; i <= 100; i++) {
            sum += i; // sum = sum + i;
        }
        System.out.println(sum);

        // 실습 1) 1~100 숫자들 중 짝수합, 홀수합을 반복문을 통해 구해 주세요.
        int evenSum = 0; // 짝수합
        int oddSum = 0; // 홀수합

        for(int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else { // 짝수가 아닐 때 -> 홀수일 때
                oddSum += i;
            }
        }

            // 실습 2) 1~100 숫자 중 3의 배수와 7의 배수의 개수를 구해 주세요
            int count3 = 0; // 3의 배수 개수
            int count7 = 0; // 7의 배수 개수

            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0) {
                    count3++;
                }
                if (i % 7 == 0) {
                    count7++;
                }
            }
        
    }
}

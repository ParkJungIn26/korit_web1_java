package _10_While;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        /*
        do {
            // 반복될 코드
        } while(조건);

        - 최소 한 번은 실행되는 반복문(결과론적 설명)

        while문 : (조건 확인 -> 실행) x n
        do-while문 : (실행 -> 조건 확인) x n
         */


        Scanner scanner = new Scanner(System.in);
        int myChoice;
        do {
            System.out.println("--메뉴선택--");
            System.out.println("1. 주문하기");
            System.out.println("2. 취소하기");
            System.out.println("0. 종료");

            System.out.println("메뉴를 선택하세요 > ");
            myChoice = scanner.nextInt();

            switch (myChoice) {
                case 1:
                    System.out.println("주문 진행");
                    break;
                case 2:
                    System.out.println("주문 취소 진행");
                    break;
                case 0:
                    System.out.println("종료합니다.");
                    break;
            }
            // myChoice == 0 -> false
        } while (myChoice != 0);

    }
}

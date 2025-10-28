package _06_if;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        // 10만 원 이상이면 10퍼센트 할인, 아니면 할인 없음
        // 가격에 따라 출력해 주세요

        Scanner scanner = new Scanner(System.in);
        System.out.println("가격을 입력하세요 >");
        int price = scanner.nextInt();
        scanner.nextLine(); // 엔터처리용 코드

        if(price >= 100000) {
            // 10% 할인 코드 작성
            double discountPrice = price * 0.9; // 정수 * 실수 -> 타입 변환
            System.out.println("최종가격 : " + discountPrice);
        } else {
            // 아무런 할인 없음
            System.out.println("최종 가격 : " + price);
        }



    }
}

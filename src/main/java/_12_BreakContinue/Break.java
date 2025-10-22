package _12_BreakContinue;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        // 반복문 - break, continue
        // break를 만나면, 반복문(for문 or while문의 중괄호)을 한 번 탈출

        for(int i = 1; i <= 10; i++) {
            System.out.println("현재 번호 : " + i);
            // 현재 번호 : 3을 콘솔에 출력하고 반복문 탈출
            if(i == 3) {
                break; // for문의 중괄호를 탈출
            }
        } // break를 읽으면 여기로 탈출

        // 웨이팅 - 50명
        // 재고 - 10개
        int waiting = 50;
        int stock = 10;
        for (int i = 1; i <= waiting; i++) {
            System.out.println(i + "번째 손님 입장");
            if(i == stock) {
                System.out.println("재고 소진");
                System.out.println("영업 종료");
                break; // 반복문 탈출!
            }
        }

        String password = "1234";
        Scanner scanner = new Scanner(System.in);
            while(true) {
                // 비밀번호를 입력 받았을 때, 비밀번호를 맞출 경우만 탈출
                System.out.println("비밀번호 입력 >>");
                String myInput = scanner.nextLine();
                
                // 탈출 조건
                if(myInput.equals(password)) {
                    System.out.println("로그인 성공!");
                    break; // while문의 중괄호 탈출
                }
        }

        // 중첩될 경우, 가장 가까운 바깥쪽 중괄호를 한 번 탈출한다.

        // 실습) 1~100까지 누적합을 합니다.
        // 그때 합꼐가 200을 넘어가면 스탑!
        // 스탑했을 때, 1. 마지막 더한 수, 2. 최종합계 출력
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i; // sum = sum + i
            if (sum > 200) {
                System.out.println("마지막 더한 수 : " + i);
                System.out.println("최종 합 : " + sum);
                break;
            }
        }





        
    }




}

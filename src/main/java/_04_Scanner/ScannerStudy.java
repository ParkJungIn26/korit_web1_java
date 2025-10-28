package _04_Scanner;

import java.util.Scanner;

public class ScannerStudy {
    public static void main(String[] args) {
        // 스캐너 - 외부(키보드)로부터 데이터를 받아오는 "객체"
        // 스캐너 객체 생성
        // 지금은 외우고 사용
        // 스캐너의 데이터 타입 -> Scanner
        Scanner scanner = new Scanner(System.in);

        // 문자열 입력받기
        // println -> 문자열 출력 이후에 엔터까지 출력
        // print -> 문자열 출력하고 엔터는 출력 x
        System.out.println("문자열을 입력하세요 >> ");
        // 엔터키까지 인식해서 데이터를 가져옴
        String myStr = scanner.nextLine();
        System.out.println("입력한 문자열 : " + myStr);
        
        // 점수 입력 받기
        System.out.println("숫자를 입력하세요 >>");
        int myInt = scanner.nextInt(); // 정수만 읽어서 가져옴
        System.out.println("입력한 정수 : " + myInt);


        // 문자열과 정수 두 개 입력 받기
        System.out.println("나이 입력 >> ");
        int age = scanner.nextInt(); // 키보드 입력(I/0버퍼)에서 정수까찌만 잘라옴
        // 나이+엔터에서 나이까지만 가져오고 엔터는 남게 됨

        scanner.nextLine(); // 남아 있는 엔터키 제거용

        System.out.println("이릅 입력 >> ");
        String name = scanner.nextLine(); // 엔터까지 인식
        // 남은 엔터를 먹고 사라짐
        
        System.out.println(); // 줄바꿈용
        System.out.println("나이 : " + age);
        System.out.println("이름 : " + name);
        
        scanner.close(); // 스캐너 반납
    }
}

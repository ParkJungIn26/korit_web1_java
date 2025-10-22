package _05_String;

import java.util.Scanner;

public class PersonalNumber {
    public static void main(String[] args) {
            String pn = "990426-1234567";
            String birthDate;
            String genderCode;

            // 1. 앞 6자리만 추출 (생년월일)
            // 2. 성별코드 (뒷자리 첫 번째 숫자) 추출
            // 출력
        birthDate = pn.substring(0,6); // 방법 1 : 0 ~ 5 index 문자열 추출
        int dashIndex = pn.indexOf("-"); // dash의 index를 찾는다
        birthDate = pn.substring(0, dashIndex); // 방법 2 : 0 ~ 대쉬 직전까지의 문자열을 추출하라
        genderCode = pn.substring(dashIndex + 1, dashIndex + 2); // 성별코드


            System.out.print("이메일을 입력하세요 >>");
            Scanner scanner = new Scanner(System.in); // 객체 생성
            String email = scanner.nextLine();
            boolean isValidEmail;
            String username;
            String domainName;
            // 1. 입력한 이메일이 유효한가 - "@" 있는가? "." 있는가?
        boolean hasAt = email.contains("@");
        boolean hasDot = email.contains(".");
        isValidEmail = email.contains("@") && email.contains(".");
            // 2. 사용자 아이디 추출
        int atIndex = email.indexOf("@");
        username = email.substring(0, atIndex);
            // 3. 도메인(naver, google) 추출
        String remain = email.substring(atIndex + 1); // @ 이후부터 끝까지
        int dotIndex = remain.indexOf("."); // 잘라온 것에서 "." 위치를 찾음
        domainName = remain.substring(0, dotIndex); // 잘라온 것에서 "." 직전까지

        System.out.println("유효한가요? " + isValidEmail);
        System.out.println("아이디 :  " + username);
        System.out.println("도메인 :  " + domainName);

        scanner.close();

    }




}

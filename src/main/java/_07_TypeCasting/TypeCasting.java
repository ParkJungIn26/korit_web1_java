package _07_TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        int intValue = 10;
        double doubleValue = 3.5;

        // double이 더 큰 자료형이라서 자동으로 결과가 double로 변환
        System.out.println(intValue + doubleValue);

        // 평균연산
        int kor = 80;
        int eng = 90;
        int math = 90;

        // 3말고 3.0(실수)로 연산해서 소숫점 아래를 살려준다.
        System.out.println((kor + eng + math) / 3.0);

        // 문자열 -> 숫자
        int i = Integer.parseInt("34");
        System.out.println(i + 1);
        double d = Double.parseDouble("34.44");
        System.out.println(d + 0.1);





    }
}

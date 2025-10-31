package _09_For;

public class NestedLoop {
    public static void main(String[] args) {
        // 2종 for문
        for (int day = 1; day <= 7; day++) {
            System.out.println(day + "일 살았음");
        } // for문 전체를 일주일로 치환해서 생각할 수 있다.
        // 한 달 -> 일주일을 4번 반복하면 된다.
        for (int week = 1; week <= 4; week++) {
            System.out.println(week + "주 시작!");
            for (int day = 1; day <= 7; day++) {
                System.out.println("\t" + day + "일 살았음");
            }
            System.out.println(week + "주 끝!");
        }

        // 구구단
        /*
        2단 시작!
            2 x 1 = 1
            2 x 2 = 4
            ...
            2 x 9 = 18
         2단 끝!
         ...
         9단까지 출력
         */
        for (int i = 1; i <= 9; i++) {
            System.out.println(2 + " x " + i + " = " + 2 * i);
        }
        System.out.println("2단 끝!");

        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("\t" + dan + "단 시작!");
            for (int i = 1; i <= 9; i++) {
                System.out.println(2 + " x " + i + " = " + dan * i);
            }
                System.out.println("\t" + dan + "단 끝!");
            }
        }

}

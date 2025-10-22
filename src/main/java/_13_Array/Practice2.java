package _13_Array;

public class Practice2 {
    public static void main(String[] args) {
        // 실습 3) scores의 평균을 구해 주세요.

        // 배열의 길이 활용!
        int[] scores = {80, 90, 75, 100, 65, 88, 91, 70}
        // 평균 -> 총합 / 개수(길이)
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double average = (double) sum / scores.length;
        System.out.println("평균 : " + average);

        // 추가 요구사항)
        // 1. 평균 이상의 학생 수를 구해 주세요. (int count)
        // 2. 최고 점수를 찾아서 출력해 주세요. (int max)

        int count = 0;
        for (int score : scores) {
            if(score >= average) {
                count++;
            }
        }
        // 최고 점수 찾기
        int max = 0;
        for (int score : scores) { // 배열에서 하나씩 꺼내오겠다
            if (score > max) { // 꺼내온 값이 현재 max보다 크다면
                max = score; // 그 값을 max 값으로 업데이트하겠다
            }
        }
    }
}

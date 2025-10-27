package _13_Array;

public class Array1 {
    public static void main(String[] args) {
        // Array(배열) : 같은 자료형의 많은 데이터를 한번에 관려하는 저장자료형
        // 연속된 공간(메모리)에 위치하기 때문에 탐색 시 유리 (빠름)

        int score1 = 90;
        int score2 = 70;
        int score3 = 50;
        int score4 = 60;
        int score5 = 20;

        int[] scores = new int[5]; // int 자료 5개 들어갈 배열 생성
        scores[0] = 90;
        scores[1] = 70;
        scores[2] = 50;
        scores[3] = 60;
        scores[4] = 20;

        // 간단하게 배열 생성 / 초기화 한번에
        int[] scores2 = new int[]{90, 70, 50, 60, 20};
        int[] scores3 = {90, 70, 50, 60, 20}; // 가장 많이 사용

        // 길이(공간 개수) 배열명.length
        System.out.println(score3);

        // 자료형[] 배열이름 = {초기화할 데이터1, 초기화할 데이터2}

        // 배열 순회 - loop(for문과 자주 쓴다)
        String[] names = {"일길동", "이길동", "삼길동", "사길동", "오길동"};
        System.out.println(names[0]); // names의 0번칸 데이터를 가져옴
        System.out.println(names[2]); // names의 2번칸 데이터를 가져옴

        for (int i = 0; i < 5; i++) { // 배열이 추가되면 조건문도 바꿔 줘야 한다


            for (i = 0; i < names.length; i++) {
                System.out.println(names[i]);
            }

            // 향상된 for문 = 항상 배열의 길이만큼 순회
            // for(하나씩 꺼낸 데이터를 담을 변수 : 배열, 리스트..)
            // 가독성 좋다, 직관적, 인덱스 접근을 막는다.
            for (String name : names) {
                System.out.println(name);
            }




        }
    }

    
    
    
}

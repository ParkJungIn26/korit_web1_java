package _35_Collections;

import java.util.ArrayList;
import java.util.List;

// Collection 자료구조 - 데이터를 저장하는 타입
// List, Map, Set > 셋 다 추상체, 구현체가 여러 개 존재한다.
public class ListMain {
    public static void main(String[] args) {
        // List의 구현체 - ArrayList(동적배열)
        // 참고) List의 또다른 구현체 - LinkedList(노드 : 비상연락망)
        // ArrayList - 탐색이 많은 서비스에 고려할 만한 대상
        // 제너릭 클래스, 내부적으로 배열을 필드로 가지고 있음
        // 내부에 가진 배열의 크기를 점점 늘려가면서 확장이 가능하다.

        // 크기 지정을 하지 않았음
        // 크기 제한도 존재하지 않음
        List<String> fruits = new ArrayList<>(); // 업캐스팅

        // 추가 - add
        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("오렌지");
        fruits.add("포도");
        fruits.add("딸기");
        // index 지정해서 추가
        // 추가되면 기존 index 1에 있던 데이터는 index가 하나씩 밀려난다
        fruits.add(1, "망고");

        // 길이 - size()
        System.out.println(fruits.size());

        // 접근 - get(index)
        System.out.println(fruits.get(0)); // 사과

        // 수정 - set(index, 데이터)
        fruits.set(0, "키위");
        System.out.println(fruits.get(0));

        // 제거 = remove(index), remove(데이터)
        // 제거하더라도 해당 인덱스 자리가 비어 있는 게 아니라,
        // 뒤쪽 데이터들의 index가 하나씩 줄어든다.
        fruits.remove(1);
        System.out.println(fruits.get(1)); // null 아님
        fruits.remove("키위"); // 중복값이 있다면 index 빠른 것 먼저 삭제

        // 포함 여부 - contains(데이터)
        System.out.println(fruits.contains("바나나"));


    }


}

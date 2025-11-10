package _38_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static java.util.stream.Nodes.collect;

public class StreamMain {
    public static void main(String[] args) {
    // 스트림 (자바 8부터 지원)
    // 1. 원본을 변경하지 않는다. (new로 리턴하는 방식)
    // 2. 파이프 라인 구조 (체이닝) - 자기자신을 리턴
    // 3. 지연 연산 (필요할 때만 실행)

        // 스트림 생성하는 방법들
        // 1. 컬렉션.stream() - List, Set 등에서 생성
        // 2. Arrays.stream() - 배열에서 생성

        List<String> names = Arrays.asList("김자바", "이파이썬", "박스프링", "최코틀린", "김자바", "정리액트");
        // 리스트를 스트림으로 변환
        Consumer<String> printer = name -> System.out.println(name);
        names.stream() // 스트림 변환
                .forEach(name -> System.out.println(name)); // 인라인으로 Consumer 구현/주입
        // forEach 같은 함수들을 StreamAPI라고 함
        // Stream 연산의 종류
        // 1. 중간 연산 : 체이닝 가능, 최종 연산을 하기 전까지는 실행 x (지연 연산)
        // 2. 최종 연산 : 마무리, 체이닝 불가능 (스트림을 소모), 최종 연산 시 중간 연산들을 실행

        // 중간연산들
        // 1. filter(Predicate<T> p)
        // true인 결과 데이터만 필터링한다
        List<String> kims = names.stream()
                .filter(name -> name.startsWith("김")); //중간연산
                .collect(Collectors.toList()); // 최종연산
        System.out.println(kims);

        // 2. map(Function<T, R> f)
        // 데이터를 변환할 때 사용
        List<String> nims = names.stream()
                .map(name -> name + "님")
                .collect(Collectors.toList());
        System.out.println(nims);

        // 3. distinct() - 중복 제거 (객체를 다룰 경우 equals, hashcode 비교)
        // 4. limit(개수) - 개수 제한
        // 중간연산은 체이닝 가능하다.
        List<String> unique3Names = names.stream()
                .distinct() // 중복 제거
                .filter(name -> name.length() == 3)
                .limit(2) // 2명만
                .collect(Collectors.toList());

        // 최종연산
        // collect(Collector<T, A, R> c)
        // 내부적으로 여러 함수형 인터페이스를 조합 (복잡함)
        // 보통 직접 구현해서 넣지 않고, 미리 정의되어 있는 것을 사용하는 게 일반적
        // Collectors.toList(), Collectors.toSet()

        // 2. forEach(Consumer<T> c)
        names.stream()
                .filter(name -> name.length() == 4) // 중간연산
                .forEach(name -> System.out.println(name)); // 최종연산
        
        

    }
}

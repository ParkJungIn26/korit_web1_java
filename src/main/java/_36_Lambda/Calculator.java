package _36_Lambda;

// 어노테이션을 달아준다. -> 컴파일 할 때, 인터페이스에 함수가 하나만 있는지 검사해 줌
@FunctionalInterface
public interface Calculator {
    // 인터페이스라서 상태를 가질 수 없음.
    int calculate(int a, int b);




}

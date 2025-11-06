package _34_Generic;

public class BoxMain {
    public static void main(String[] args) {
        // String, Integer 모두 최상위 부모가 Object
        Box box1 =  new Box("아이템1"); // String -> Object 업캐스팅
        Box box2 = new Box(20); // Integer -> Object 업캐스팅

    }
    
    
    // 제너릭
    // 클래스나 메서드에서 타입을 미리 정의하지 않고, 사용할 때 정의하는 문법
    // 1. 컴파일러가 알아서 업캐스팅, 다운캐스팅 코드를 작성해 준다.
    // 2. 컴파일러가 잘못된 제너릭문법이면(잘못된 다운캐스팅, 업캐스팅)
    // 컴파일 에러를 일으킨다.(장점)
    // -> 제너릭 문법을 잘 쓰면 캐스팅 과정에서 런타임에러를 방지할 수 있다.
    
    
    
    
    
    
}

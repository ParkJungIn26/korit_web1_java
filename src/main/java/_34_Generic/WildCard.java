package _34_Generic;

import _34_Generic.Animal.Animal;

public class WildCard {
    /*
    와일드카드 문법
    제너릭 타입에서 구체적인 타입 대신 ? 사용하는 방법 - 주로 메서드에서 사용됨
     */

    // 제한 없는 와일드카드
    // 어떤 타입이 오든지 허용하겠다 : 다양한 타입에 대해 같은 메서드 시그니처로 처리하겠다
    // 참고) 구체적인 타입 정보는 컴파일 타임에만 존재하고, 런타임에는 Object로 취급
    // Box2<T> box 뭐가 다른가? : Box2<T>는 객체를 생성할 때 유동적으로 지정하는 것
    // Box2<?>는 이미 생성되어 있는 제너릭 Box2 타입들을 모두 대응하겠다.
    public static void printAnyBox(Box2<?> box) {
        System.out.println(box.getItem()); // 읽기는 가능
        // box.setItem("문자"); // 쓰기는 불가능
        // 필드로 가지고 있는 item은 Object로 취급하기 때문
        // 타입 안정성이 깨질 수 있어 set(쓰기)는 문법적으로 막아 둔다.
        
        // 매개변수로 Box2<String>, Box<Integer> 타입의 객체를 넘겨주더라도
        // 다운캐스팅 불가능함 -> Object로 취급하기 때문
        // Integer myData = box.getItem();
        Object myData = box.getItem();
    }
    
    // 상한 경계 와일드카드
    // 런타임에 Object가 아니라 Animal로 취급
    public static void printAnimalBox(Box2<? extends Animal> animalBox) {
        // 상한 경계를 만들었기 때문에 Animal 타입이 보장됨
        Animal animal = animalBox.getItem();
        // set(쓰기)는 불가능
    }

    // 하한 경계 와일드카드
    // Object까지 업캐스팅 할 것. 다운캐스팅 Animal까지 제한
    public static void addAnimalToBox(Box2<? super Animal> box, Animal animal) {
        box.getItem();
        box.setItem(animal); // 쓰기가 가능해짐
        // Animal 또는 그 하위타입을 상위타입에 안전하게 쓰기가 가능하다.
    }


}

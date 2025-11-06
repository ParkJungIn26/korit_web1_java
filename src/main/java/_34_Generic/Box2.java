package _34_Generic;

// <T>, <E>, <K, V>, <K, V, E>

public class Box2<T> {
    // 클래스명<T> -> 해당 클래스 내에서는 가상의 타입(T)를 쓸 수 있다.
    private T getitem;

    public Box2(T getitem) {
        this.getitem = getitem;
    }

    public T getItem() {
        T Box2 = null;
        return Box2;
    }

    // Box2 타입을 받는 매개변수
    // 제너릭타입의 매개변수를 받아 줄 때 정의하는 법
    public static <T> void printBoxData(Box2<T> box) {
        box.getItem();


    }

    public void setItem(T animal) {
    }
}


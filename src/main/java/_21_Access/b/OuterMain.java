package _21_Access.b;

import _21_Access.a.AccessData;

public class OuterMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();

        // public - 직접 접근 가능
        accessData.publicField = 1; // 가능
        accessData.publicMethod(); // 호출 가능

        // default - 다른 패키지라서 접근 불가능
        // accessData.defaultField = 2;
        // accessData.defaultMethod();

        // private - 클래스 내부에서만 접근 가능
        // accessData.privateField 접근 불가
        // accessData.privateMethod(); 호출 불가

        // private 필드, 메서드 -> 접근하려면 열려 있는 메서드로 접근해야 한다.
        accessData.inner(); // 간접적으로 내부에 접근


        // main을 실행할 때 어떤 일이 일어나는가?
        // 1) .java 파일 -> .class 파일 (컴파일) - 컴파일 시점
        // 2) .class 파일을 JVM이 읽는다 - 런타임 시점
        // 3) JVM이 OS와 소통하면서 작동한다

        // 접근제어자의 주도권은 컴파일러에게 있다.







    }
}

package _22_Static;

public class Main {
    /*
    public : 외부에서 접근할 수 있다. JVM이 호출해야 하니까 
    static : 객체 생성 없이, 실행 가능해야 함
    void : 리턴 x main은 오로지 프로그램 시작만 담당
    String[] args -> args라는 변수로 외부로부터 문자열배열을 받아오겠다
    -> java 외부로부터 데이터를 받아오는 역할
     */
    public static void main(String[] args) {

      /*
      메서드 영역(Method Area)
      - 클래스 정보를 저장하는 공간
      - 클래스 정보 : 메서드 정보(메서드 시그니처), static 변수

      - 참고) 메서드 영역은 main 실행하자마자 먼저 로드된다.
      
      
       */
      
      
      
      
        StaticData staticData1 = new StaticData(1);
        StaticData staticData2 = new StaticData(2);
        StaticData staticData3 = new StaticData(3);
        // 생성자 총 3번 호출

        // 생성자는 3번 호출되었더라도
        // count는 객체마다 가지고 있는 변수라서 0 -> 1 (최초 호출)
        // 변경 이후 아무 일도 일어나지 않는다.
        System.out.println(staticData1.count); // 값? 1
        System.out.println(staticData2.count); // 값? 1
        System.out.println(staticData3.count); // 값? 1

        // staticCount 변수는 heap에 있을까? heap에 없다.
        // 별도의 메모리 공간에 존재(Method Area)
        // 클래스 변수로서, 모든 객체가 공유한다. (하나의 메모리 공간만 차지한다.)
        System.out.println(staticData1.staticCount); // 값 3
        System.out.println(staticData2.staticCount); // 값 3
        System.out.println(staticData3.staticCount); // 값 3

        // 클래스로도 참조할 수 있음 (권장되는 방식)
        System.out.println(StaticData.staticCount);
        
        

    }
}

package _22_Static;

// Static : 정적(고정값) -> 값이 변하지 않는다는 뜻은 아니다.

public class StaticData {
    // 초기화를 안 할 경우 -> 기본값이 들어가 있음
    // int, long -> 0, double, float -> 0.0
    // 참조자료형 -> null
    
    // id, count -> 인스턴스 변수 : 각 객체마다 별도의 heap 공간 존재
    private int id;
    public int count = 0;

    public static int staticCount = 0;

    public StaticData(int id) {
        this.id = id;
        staticCount++; // 생성자가 호출될 때 + 1
        this.count++; // 생성자가 호출될 때 + 1

    }
}

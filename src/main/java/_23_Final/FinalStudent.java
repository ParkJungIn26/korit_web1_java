package _23_Final;

public class FinalStudent {
    private final String name; // 이름
    private int studentId; // 학번
    private int age; // 나이


    public FinalStudent(String name, int StudentId, int age) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

        // 이런 메서드는 불가능 (final이라서)
    // public void setStudentId(int id) {
    //    this.studentId = id;
    // }


    public FinalStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // final 파라미터 - 외부에서 들어온 값을 변경하지 않겠다.
    public void printInfo(final String schoolName) {

    }

    public void setAge(int i) {
    }
}

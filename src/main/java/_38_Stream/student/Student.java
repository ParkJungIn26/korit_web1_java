package _38_Stream.student;

@Data
@AllArgsConstructor

public class Student {

    private String name; // 이름
    private String major; // 전공
    private int score;
    private String phoneNumber;
    private String email;

    public  Student(String name, String major, int score, String phoneNumber, String email) {
    }

    public int getScore() {
    }

    public Object getMajor() {
    }
    public Object getScore;
    public Object getName;

    public Object getName() {
    }

    public Object getEmail() {
        return null;
    }

    public void toDto() {
    }


    // dto로 변환하는 메서드를 정의
    public StudentDto toDto() {
        String grade;
        if(score >= 90) grade = "A";
        else if(score >= 80) grade = "B";
        else if(score >= 70) grade = "C";
        else grade = "F";

        return new StudentDto(this.name, major, grade);
    }

    // dto2로 변환하는 인스턴스 메서드
    public StudentDto2 toDto2() {
        // this.email에서 id만 추출하는 코드 작성
        int index = email.indexOf("@"); // aaaaa@bbbb.com
        String emailId = email.substring(0, indexOfAt);

        return new StudentDto2(name, major, score, emailId);
    }




}


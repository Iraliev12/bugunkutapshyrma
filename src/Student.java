public class Student extends  Person {
    private String schoolname;
    private String grade;

    public Student(String name, int age, String schoolname, String grade) {
        super(name, age);
        this.schoolname = schoolname;
        this.grade = grade;
    }

    @Override
    public void iAmAble() {
        System.out.println("I am student and i can get marks");
    }

    public String getSchoolname() {
        return schoolname;
    }

    public String getGrade() {
        return grade;
    }
}
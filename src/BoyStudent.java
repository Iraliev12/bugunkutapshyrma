public class BoyStudent extends Person{
    private  String hobby;
    private String phobia;

    public String getHobby() {
        return hobby;
    }

    public String getPhobia() {
        return phobia;
    }

    public BoyStudent(String name, int age, String hobby, String phobia) {
        super(name, age);
        this.hobby = hobby;
        this.phobia = phobia;
    }
    public void iHateToDo(){
        System.out.println("I hate to read books and chinese food");
    }
}

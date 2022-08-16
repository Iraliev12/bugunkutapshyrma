public class GirlStudent extends  Person{
    private  String favvoriteSubject;
    private String teamMate;

    public GirlStudent(String name, int  age, String favvoriteSubject, String teamMate) {
        super(name, age);
        this.favvoriteSubject = favvoriteSubject;
        this.teamMate = teamMate;
    }

    public void iloveToDo() {
        System.out.println("I love to play a piano");
    }

    public String getFavvoriteSubject() {
        return favvoriteSubject;
    }

    public String getTeamMate() {
        return teamMate;
    }
}

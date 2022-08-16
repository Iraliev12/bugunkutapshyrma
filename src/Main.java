import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(10,100);

        Person person = new Person("nurs",15);
        Student student= new Student("islam",20,"peaksoft","5" );
        GirlStudent girlStudent= new GirlStudent("aika",21,"massiv","nurs");
     GirlStudent girlStudent1= new GirlStudent("guzel",24,"for","nuris");
        GirlStudent girlStudent2= new GirlStudent("jazgul",20,"informatika",
                "nurs");
        BoyStudent boyStudent = new BoyStudent("bakai",28,"tennis","ujas");
        BoyStudent boyStudent1=new BoyStudent("bakyt",18,"futbool","accident");

Person[]persons = {person,student,girlStudent,girlStudent1,girlStudent2,boyStudent,boyStudent1};

        for (Person i:persons) {
            System.out.println("name:"+i.getName());
            System.out.println("age:"+i.getAge());
           i.iAmAble();
            System.out.println("---------------");
            System.out.println("schoolname:"+student.getSchoolname());
            System.out.println("grade:"+student.getGrade());

            System.out.println(girlStudent.getFavvoriteSubject());
            System.out.println(girlStudent.getTeamMate());

            System.out.println(girlStudent1.getFavvoriteSubject());
            System.out.println(girlStudent1.getTeamMate());

            System.out.println(girlStudent2.getFavvoriteSubject());
            System.out.println(girlStudent2.getTeamMate());


            System.out.println(boyStudent.getHobby());
            System.out.println(boyStudent.getPhobia());

            System.out.println(boyStudent1.getHobby());
            System.out.println(boyStudent1.getPhobia());
        }

    }
}
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void iAmAble(){
        System.out.println("I am person and I am able to walk");
    }

    public String getName() {
        return name;
    }

    public String getAge() {
return String.valueOf(age);
    }
}

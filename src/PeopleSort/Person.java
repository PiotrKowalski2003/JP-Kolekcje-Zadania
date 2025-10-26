package PeopleSort;

public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Gettery
    public String getName() {return name;}
    public int getAge() {return age;}

    @Override
    public String toString() {
        return name + " " + age + " lat";
    }


}

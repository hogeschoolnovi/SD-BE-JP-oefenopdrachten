package nl.novi.opdrachten;

public class Person {

    private String firstName;
    private int age;

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String makeALine() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(this.firstName).append(" ").append(this.age);

        return stringBuilder.toString();
    }
}

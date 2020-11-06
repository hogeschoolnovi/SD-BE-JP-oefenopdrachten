package nl.novi.opdrachten;

import java.util.ArrayList;
import java.util.List;

public class ListExtra {
    public static void main(String[] args) {
        Person personSjaak = new Person();
        personSjaak.setAge(12);
        personSjaak.setFirstName("Sjaak");

        Person personHarry = new Person();
        personHarry.setAge(13);
        personHarry.setFirstName("Harry");

        List<Person> persons = new ArrayList<>();
        persons.add(personHarry);
        persons.add(personSjaak);

        printPersonList(persons);

    }

    private static void printPersonList(List<Person> persons) {
        for(Person person : persons) {
            System.out.println(person.getFirstName());
            System.out.println(person.getAge());

            System.out.println(person.getFirstName() + " " + person.getAge());
            System.out.println("---");
            System.out.println(person.makeALine());
        }
    }


}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Room {
    ArrayList<Person> persons = new ArrayList<>();

    public Room() {
        this.persons = new ArrayList<Person>();
    }

    public void add(Person person) {
        persons.add(person);
    }

    public boolean isEmpty() {
        return persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public Person shortest() {
        if (persons.isEmpty()) {
            return null;
        }

        return Collections.min(persons, Comparator.comparing(Person::getHeight));

//        Another way is ...
//        Person minimumHeight = persons.get(0);
//
//        for (Person person : persons) {
//            if (person.getHeight() < minimumHeight.getHeight()) {
//                minimumHeight = person;
//            }
//        }
//        return minimumHeight;
    }

    public Person take() {
        if (persons.isEmpty()) {
            return null;
        }

        Person collection = Collections.min(persons, Comparator.comparing(Person::getHeight));
        persons.remove(collection);
        return collection;

//        Another way is ...
//        Person minimumHeight = persons.get(0);
//
//        for (Person person : persons) {
//            if (person.getHeight() < minimumHeight.getHeight()) {
//                minimumHeight = person;
//            }
//        }
//        persons.remove(minimumHeight);
//        return minimumHeight;
    }
}

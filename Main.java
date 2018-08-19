import java.util.ArrayList;

/**
 * Created by mikaelbs on 19/08/2018.
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Person("Mikael",31,80.2,true,Gender.MALE));
        persons.add(new Person("Christine",27,60.2,true,Gender.FEMALE));
        persons.add(new Person("Gunnar",50,130,false,Gender.FEMALE));

        persons.forEach(person -> System.out.println(person.name));


    }

}

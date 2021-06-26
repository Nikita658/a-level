package HW17;

import java.util.*;
import java.util.stream.Collectors;

public class TAsk {
    public static void main(String[] args) {
        List<Person> Persons = List.of(
                new Person(1, "Joh", 1),
                new Person(4, "Helly", 2),
                new Person(5, "Klaus", 3),
                new Person(7, "Camila", 4)
        );

        List<String> names = Persons.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println("ALL NAmeS: " + names);
        OptionalInt countMaxId = Persons.stream()
                .mapToInt(Person::getId)
                .max();
        System.out.println("MAx id: " + countMaxId);


        int countA = Persons.stream()
                .filter(s -> s.getName().contains("a"))
                .mapToInt(Person::getCount)
                .sum();
        System.out.println( countA);

        Map<Integer, String> map = Persons.stream()
                .collect(Collectors.toMap(Person::getId, Person::getName));
        System.out.println( map);
    }
}

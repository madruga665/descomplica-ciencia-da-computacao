import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Person> listName = new ArrayList<Person>();

        listName.add(new Person("Luciano", 37));
        listName.add(new Person("Vanessa", 32));
        listName.add(new Person("Julia", 15));
        listName.add(new Person("Heitor", 8));
        listName.add(new Person("Dante", 3));
        listName.add(new Person("Lola", 12));
        listName.add(new Person("Lola", 12));

        System.out.println("Tamanho da lista: " + listName.size());

        Iterator<Person> iterator = listName.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }

        System.out.println("========== Ordenação com Comparator ==========");

        Comparator<Person> comparator = new Comparator<Person>() {
            public int compare(Person person, Person otherPerson) {
                return Integer.compare(person.getAge(), otherPerson.getAge());
            }
        };

        Collections.sort(listName, comparator);

        for (Person person : listName) {
            System.out.println("Nome: " + person.getName() + " Idade: " + person.getAge());
        }
    }
}

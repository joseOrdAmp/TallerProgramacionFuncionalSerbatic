package b_interfascesFuncionales;

import java.util.function.Consumer;
import java.util.function.Predicate;
import personas.Gender;
import personas.Person;

public class Diapositiva19_20 {

    public static void main(String[] args) {

        Person p1 = new Person("Antonio", 20, Gender.MALE);
        Person p2 = new Person("Manuel", 15, Gender.MALE);
        
        Consumer<Person> miConsumer = x -> x.setSueldo(2000);
        
        Consumer<Person> miConsumer2 = x ->{
             if(x.getAge()>20) {
                 miConsumer.accept(x);
             }
        };
        
        miConsumer2.accept(p2);
        
    }
}

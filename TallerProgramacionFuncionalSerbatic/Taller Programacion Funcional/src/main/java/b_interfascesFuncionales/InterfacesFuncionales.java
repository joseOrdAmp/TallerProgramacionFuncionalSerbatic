package b_interfascesFuncionales;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import personas.Gender;
import personas.Person;

public class InterfacesFuncionales {
    
    public static void main(String[] args) {
        
        List<Person> personas = Mock.getPeople();
        
        Predicate<Person> pred1 = (j) -> j.getGender()==Gender.FEMALE;
        
        
        filtrando(personas,pred1);
        
        
        Predicate<Person> pred2 = (k) -> k.getAge()>50;
        
        filtrando(personas,pred2);
        
    }
    
    private static void filtrando(List<Person> personas,Predicate<Person> pred) {
        
        List<Person> personasFiltradas = new ArrayList<>();
        
        for(Person p : personas) {
            if(pred.test(p)) {
                personasFiltradas.add(p);
            }
        }
        
        
        System.out.println("For each funcional \n");
        personasFiltradas.forEach(System.out::println);
        
        //Equivalente
        
        System.out.println("\nFor each clasico \n");
        for(Person p : personasFiltradas) {
            System.out.println(p);
        }
        System.out.println("\n \n");
    }
}

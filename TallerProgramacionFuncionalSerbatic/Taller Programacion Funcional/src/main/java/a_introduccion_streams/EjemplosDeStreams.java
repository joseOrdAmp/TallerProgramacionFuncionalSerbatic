package a_introduccion_streams;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import interfascesFuncionales.Mock;
import personas.Person;



public class EjemplosDeStreams {
    
    public static void main(String[] args) {
        List<Person> list =  Mock.getPeople();
        
        //ejemplo1Clasico(list);
        //ejemplo1Stream(list);
        
        //ejemplo2Clasico(list);
        ejemplo2Stream(list);
        
    }
    
    
    private static void ejemplo1Clasico(List<Person> lista) {
        for(Person p : lista) {
            System.out.println(p);
        }
    }
    
    private static void ejemplo1Stream(List<Person> lista) {
        lista.stream().forEach(p -> System.out.println(p));
    }
    
    
    private static void ejemplo2Clasico(List<Person> lista) {
        List<Person> nuevaLista = new ArrayList<>();
        for(Person p : lista) {
            if(p.getName().startsWith("A")) {
                nuevaLista.add(p);
                System.out.println(p);
            }
        }
        
    }
    
    private static void ejemplo2Stream(List<Person> lista) {
        List<Person> nuevaLista = new ArrayList<>();
        Function<Person,String> miFunc =p -> {nuevaLista.add(p);
                                                return p.getName();};
                                                
        Predicate<Person> miPred = (p) -> p.getName().startsWith("A");      
        
        
        lista.stream().filter(miPred).map(miFunc).forEach(x -> System.out.println(x));
        }
    }
}



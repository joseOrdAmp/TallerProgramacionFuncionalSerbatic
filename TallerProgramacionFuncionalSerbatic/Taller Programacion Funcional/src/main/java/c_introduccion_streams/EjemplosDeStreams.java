package c_introduccion_streams;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import b_interfascesFuncionales.Mock;
import personas.Person;



public class EjemplosDeStreams {
    
    public static void main(String[] args) {
        List<Person> list =  Mock.getPeople();
        
//        ejemplo1Clasico(list);
//        ejemplo1Stream(list);
//        
//        ejemplo2Clasico(list);
//        ejemplo2Stream(list);
//        
//        ejemploFiltrarYgenerarNuevaListaClasico(list);
//        
//        List<Person> nuevaList0 =ejemploFiltrarYgenerarNuevaListaStream(list);
//        List<Person> nuevaList1 = ejemploFiltrarYgenerarNuevaListaStream(list,p->p.getName().startsWith("A"));
//        List<Person> nuevaList2 = ejemploFiltrarYgenerarNuevaListaStream(list,p->p.getName().startsWith("T"));
//        List<Person> nuevaList3 = ejemploFiltrarYgenerarNuevaListaStream(list,p->p.getName().startsWith("T") && p.getAge()<50);
    }
    

    private static void ejemplo1Clasico(List<Person> lista) {
        for(Person p : lista) {
            System.out.println(p);
        }
    }
    
    private static void ejemplo1Stream(List<Person> lista) {
        lista.stream().forEach(p -> System.out.println(p));
    }    
    
    
    
    private static List<Person> ejemploFiltrarYgenerarNuevaListaClasico(List<Person> lista) {
        List<Person> nuevaLista = new ArrayList<>();
        for(Person p : lista) {
            if(p.getName().startsWith("A")) {
                nuevaLista.add(p);
            }
        }
        return nuevaLista;
    }
    
    private static List<Person> ejemploFiltrarYgenerarNuevaListaStream(List<Person> lista) {
        return lista.stream().filter(p->p.getName().startsWith("A")).collect(Collectors.toList());
    }
    
    private static List<Person> ejemploFiltrarYgenerarNuevaListaStream(List<Person> lista,Predicate<Person> pred) {
        return lista.stream().filter(pred).collect(Collectors.toList());
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
    
    private static List<Person> ejemplo2Stream(List<Person> lista) {
        List<Person> nuevaLista = new ArrayList<>();
        Function<Person,String> miFunc =p -> {
                                                nuevaLista.add(p);
                                                return p.getName();
                                                };
        Predicate<Person> miPred = (p) -> p.getName().startsWith("A");      
        
        lista.stream().filter(miPred).map(miFunc).forEach(x -> System.out.println(x));
        
        
        //Sin crear por separado el predicate y el mifunc
        lista.stream().filter(p -> p.getName().startsWith("A")).map(p -> {nuevaLista.add(p);return p.getName();}).forEach(x -> System.out.println(x));
        
        return nuevaLista;
        }
    }





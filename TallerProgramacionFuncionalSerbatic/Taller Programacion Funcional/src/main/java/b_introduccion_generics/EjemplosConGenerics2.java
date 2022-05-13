package b_introduccion_generics;

import java.util.function.BiFunction;
import personas.Gender;
import personas.Person;

public class EjemplosConGenerics2 {
    public static void main(String[] args) {
        Person p1 = new Person("Antonio", 20, Gender.MALE);
        Person p2 = new Person("Manuel", 15, Gender.MALE);
        
        Integer r1 = metodoEjemplo3(p1,p2,(x,y)->x.getSueldo()-y.getSueldo());
        Integer r2 = metodoEjemplo3(p1,p2,(x,y)->x.getSueldo()+y.getSueldo());
        Integer r3 = metodoEjemplo3(p1,p2,(x,y)->x.getSueldo()*y.getSueldo());
    }
    
    private static Integer metodoEjemplo(Person p1,Person p2) {
        p1.setSueldo(obtenerSueldoSimulado(p1));
        p2.setSueldo(obtenerSueldoSimulado(p2));
        
        return Math.abs(p1.getSueldo()-p2.getSueldo());
    }
    
    private static Integer metodoEjemplo2(Person p1,Person p2) {
        p1.setSueldo(obtenerSueldoSimulado(p1));
        p2.setSueldo(obtenerSueldoSimulado(p2));
        
        return Math.abs(p1.getSueldo()+p2.getSueldo());
    }
    
    private static Integer metodoEjemplo3(Person p1,Person p2) {
        p1.setSueldo(obtenerSueldoSimulado(p1));
        p2.setSueldo(obtenerSueldoSimulado(p2));
        
        return Math.abs(p1.getSueldo()*p2.getSueldo());
    }
    
    private static  Integer metodoEjemplo3(Person p1,Person p2,BiFunction<Person,Person,Integer> bFunc) {
        p1.setSueldo(obtenerSueldoSimulado(p1));
        p2.setSueldo(obtenerSueldoSimulado(p2));
        
        return bFunc.apply(p1, p2);
    }
    
    
    private static Integer obtenerSueldoSimulado(Person p1){
       return  p1.getAge()*100;
   }
    
    
    interface CustomTriPredicae<T,U,K>{
        boolean test(T t,U u ,K k);
    }
}

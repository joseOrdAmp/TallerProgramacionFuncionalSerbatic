package interfascesFuncionales.ejercicio0;

import java.util.ArrayList;
import java.util.List;
import personas.Gender;
import personas.Person;

public class ejercicio0 {

    public static void main(String[] args) {
        //Transformar los metodos a interfaces funcionales.

    }
    
    

    private Integer suma(Integer d1,Integer d2) {
        return d1+d2;
    }
    
    private Double suma(Integer d1) {
        return d1*Math.random()*100;
    }
    
    private boolean pruebaGenero(Person d1) {
        return d1.getGender() == Gender.FEMALE ;
    }
    
    private Person generarPersona() {
        Double id = Math.random()*1000;
        int edad = (int)Math.random()*100;
        
        return new Person("Persona"+id,edad,(edad%2)==0 ? Gender.FEMALE :  Gender.MALE);
    }
    
    private List<Person> generarLista(){
        List<Person> l = new ArrayList<>();
        l.add(generarPersona());
        l.add(generarPersona());
        l.add(generarPersona());
        l.add(generarPersona());
        return l;
    }
    
    
    private boolean pruebaGenero(Person d1,Person d2) {
        return d1.getGender()==d2.getGender() ;
    }
    
    private boolean pruebaGenero2(Person d1,Person d2,Person d3) {
        return d1.getGender()==d2.getGender() && d2.getGender()==d3.getGender();
    }
    
    private void datosToString(String d1,Integer d2,Person d3) {
        System.out.println(d1 + d2 + d3);
    }
    


}

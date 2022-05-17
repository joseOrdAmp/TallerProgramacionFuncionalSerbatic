package c_introduccion_streams;

import java.util.*;
import java.util.stream.Collectors;
import personas.Gender;
import personas.Person;
public class EjercicioStream2 {
    
    public static void main(String[] args) {
        List<Fichero> listaNombresFicheros = new ArrayList<>();
        listaNombresFicheros.add(new Fichero("fichero_1645461645.txt",1111,new Person("jose",34,Gender.MALE)));
        listaNombresFicheros.add(new Fichero("fichero_1045441572.txt",7894,new Person("juan",22,Gender.MALE)));
        listaNombresFicheros.add(new Fichero("fichero_1142363563.txt",1234,new Person("pedro",25,Gender.MALE)));
        listaNombresFicheros.add(new Fichero("fichero_1385462869.txt",5324,new Person("marco",59,Gender.MALE)));
        listaNombresFicheros.add(new Fichero("fichero_1365462860.txt",6323,new Person("pedro",12,Gender.MALE)));
        listaNombresFicheros.add(new Fichero("fichero_1945468963.txt",2322,new Person("arturo",19,Gender.MALE)));
        listaNombresFicheros.add(new Fichero("fichero_1385462869.txt",5324,new Person("ana",24,Gender.FEMALE)));
        listaNombresFicheros.add(new Fichero("fichero_1365462860.txt",6323,new Person("maria",12,Gender.FEMALE)));
        listaNombresFicheros.add(new Fichero("fichero_1945468963.txt",2322,new Person("julia",19,Gender.FEMALE)));
        
        
        
        Map<Gender,List<Fichero>> map = listaNombresFicheros.stream()
                .collect(Collectors.groupingBy(x-> x.getPropietario().getGender(),Collectors.mapping(x->x,Collectors.toList())));
                        
                        
                        
        
        map.forEach((x,y) -> 
        
        System.out.println( x +"--"+y));
        
        
        
        
        
    }

}

class Fichero{
    String nombre_timeStamp;
    int tamaño;
    Person propietario;
    
    Fichero(String nombre_timeStamp,int tamaño,Person propietario){
        this.nombre_timeStamp=nombre_timeStamp;
        this.tamaño=tamaño;
        this.propietario = propietario;
    }

    
    @Override
    public String toString() {
        return "Fichero [nombre_timeStamp=" + nombre_timeStamp + ", tamaño=" + tamaño + ", propietario=" + propietario
                + "]";
    }


    /**
     * @return the nombre_timeStamp
     */
    public String getNombre_timeStamp() {
        return nombre_timeStamp;
    }

    
    /**
     * @param nombre_timeStamp the nombre_timeStamp to set
     */
    public void setNombre_timeStamp(String nombre_timeStamp) {
        this.nombre_timeStamp = nombre_timeStamp;
    }

    
    /**
     * @return the tamaño
     */
    public int getTamaño() {
        return tamaño;
    }

    
    /**
     * @param tamaño the tamaño to set
     */
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    
    /**
     * @return the propietario
     */
    public Person getPropietario() {
        return propietario;
    }

    
    /**
     * @param propietario the propietario to set
     */
    public void setPropietario(Person propietario) {
        this.propietario = propietario;
    }
    
    
}

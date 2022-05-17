package c_introduccion_streams;

import java.util.*;
import java.util.stream.Collectors;
import personas.Gender;
import personas.Person;
public class EjercicioStream1 {
    
    public static void main(String[] args) {
        List<Fichero> listaNombresFicheros = new ArrayList<>();
        listaNombresFicheros.add(new Fichero("fichero_1645461645.txt",1111,new Person("jose",34,Gender.MALE)));
        listaNombresFicheros.add(new Fichero("fichero_1045441572.txt",7894,new Person("juan",22,Gender.MALE)));
        listaNombresFicheros.add(new Fichero("fichero_1142363563.txt",1234,new Person("pedro",25,Gender.MALE)));
        listaNombresFicheros.add(new Fichero("fichero_1385462869.txt",5324,new Person("marco",59,Gender.MALE)));
        listaNombresFicheros.add(new Fichero("fichero_1365462860.txt",6323,new Person("pedro",12,Gender.MALE)));
        listaNombresFicheros.add(new Fichero("fichero_1945468963.txt",2322,new Person("arturo",19,Gender.MALE)));
        listaNombresFicheros.add(new Fichero("fichero_1245468963.txt",2322,new Person("Maria",19,Gender.FEMALE)));
        listaNombresFicheros.add(new Fichero("fichero_1315468963.txt",2322,new Person("catalina",91,Gender.FEMALE)));

        
        
        
        //Sacar por consola todas las mujeres  cuyo fichero tenga un timeStamp menor que 1400000000  
        
        listaNombresFicheros.stream().filter(x->x.propietario.getGender()== Gender.FEMALE).forEach(System.out::println);
        
        
        //Obtener  el ficheros cuyo propietario tenga mas edad

        Optional<Fichero> maxF =listaNombresFicheros.stream().max((x,y) -> x.propietario.getAge() - y.propietario.getAge());
        
        //Obtener una lista cambiandoles el genero a todos las personas cuyo nomre empiece con "p"
        
        List<Fichero> nuevaListaNombresFicheros = new ArrayList<>();
        listaNombresFicheros.stream().forEach(x->{
            x.propietario.setGender(x.propietario.getGender() ==  Gender.MALE? Gender.FEMALE : Gender.MALE );
            nuevaListaNombresFicheros.add(x);
        });

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
}

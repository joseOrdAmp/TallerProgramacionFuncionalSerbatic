package interfascesFuncionales.ejercicio1;

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
        
        //Ordenar con Streams utilizando solo el timeStamp del nombre del fichero
        
        
        //Obtener  el ficheros cuyo propietario tenga mas edad

        
        //Obtener una lista cambiandoles el genero a todos las personas cuyo nomre empiece con "p"
       
        
        
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
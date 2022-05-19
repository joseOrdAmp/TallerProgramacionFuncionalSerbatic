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
        listaNombresFicheros.add(new Fichero("fichero_1245468963.txt",2322,new Person("maria",19,Gender.FEMALE)));
        listaNombresFicheros.add(new Fichero("fichero_1315468963.txt",2322,new Person("catalina",91,Gender.FEMALE)));
        listaNombresFicheros.add(new Fichero("fichero_1815468963.txt",2322,new Person("pepa",51,Gender.FEMALE)));
        
        
        
        //Sacar por consola el nombre todas las mujeres  cuyo fichero tenga un timeStamp menor que 1400000000  

        //Obtener una lista nueva cambiandoles el genero a todos las personas cuyo nomre empiece con "p"
        
        
        //Aumentar en 200 el sueldo solo de las personas cuya edad sea menor que 25 y mostrar por pantalla sus "nombre - sueldo"
        
        
        //Sacar por pantalla la lista ordenada por nombre ascendente
        
        
        //Sacar por pantalla la lista ordenada por nombre descendente
        
        //Sacar por pantalla la lista ordenada por edad ascendente
        
        
        //Obtener  el ficheros cuyo propietario tenga mas edad

        
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

    
    public String getNombre_timeStamp() {
        return nombre_timeStamp;
    }

    public void setNombre_timeStamp(String nombre_timeStamp) {
        this.nombre_timeStamp = nombre_timeStamp;
    }
    
    public int getTamaño() {
        return tamaño;
    }
    
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public Person getPropietario() {
        return propietario;
    }

    public void setPropietario(Person propietario) {
        this.propietario = propietario;
    }
    
}

package b_introduccion_generics;

import java.util.ArrayList;
import java.util.List;
import personas.Gender;
import personas.Person;

public class EjemplosConGenerics {

    public static void main(String[] args) {
        MiLista<String> milista = new MiLista<>();
        milista.miAdd("hola");
        System.out.println(milista.miGet(0));

        MiLista<Person> milista2 = new MiLista<>();
        milista2.miAdd(new Person("Antonio", 20, Gender.MALE));
        System.out.println(milista2.miGet(0).toString());

        Caja<String, Integer> caja1 = new Caja("elefantes", 20);

        String contenidoCaja1 = caja1.getContenido();

        Caja<Person, Integer> caja2 = new Caja(new Person("Antonio", 20, Gender.MALE), 23);

        Person p = caja2.getContenido();

        // Hacer un MiListaDeCajas con personas

        MiLista<Caja<Person, Integer>> miListaNueva = new MiLista<>();

        miListaNueva.miAdd(new Caja(new Person("Antonio", 20, Gender.MALE), 23));
        miListaNueva.miAdd(new Caja(new Person("Antonio", 20, Gender.MALE), 23));

        miListaNueva.miIterar();

        MiLista<Caja<String, Integer>> miListaNueva2 = new MiLista<>();

        miListaNueva2.miAdd(new Caja("unString", 23));
        miListaNueva2.miAdd(new Caja("otroString", 23));

        miListaNueva2.miIterar();

        MiLista<Caja<Object, Integer>> miListaNueva3 = new MiLista<>();

        miListaNueva3.miAdd(new Caja(new Object(), 23));
        miListaNueva3.miAdd(new Caja(new Object(), 23));

        miListaNueva3.miIterar();
        
        
        List<String> listaString1 = new ArrayList<>();
        List<String> listaString2 = new ArrayList<>();
        
        List<Integer> listaInteger = new ArrayList<>();
        
        copiarListas(listaString1,listaString2);
        copiarListas(listaString1,listaInteger);
        
        getPrimerValor(listaString1);
        getPrimerValor(listaInteger);
    }
    
    public static <T> void copiarListas(List<T> destino, List<T> source) {
        for (T t : source) {
            destino.add(t);
        }
    }
    public static <T> T getPrimerValor(List<T> lista) {
        return lista.get(0);
    }
    
    
}

class MiLista<T> {

    List<T> lista = new ArrayList<>();

    public void miAdd(T obj) {
        lista.add(obj);
    }

    public T miGet(int i) {
        return lista.get(i);
    }

    public void miIterar() {
        for (T obj : lista) {
            System.out.println(obj);
        }
        // lista.forEach(x -> x.toString());
    }


}

class Caja<T, U extends Number> {
    T contenido;
    U peso;

    public Caja(T contenido, U cantidad) {
        this.contenido = contenido;
        this.peso = cantidad;
    }

    public T getContenido() {
        return contenido;
    }

    public U getid() {
        return peso;
    }

    @Override
    public String toString() {
        return "Caja [contenido=" + contenido + ", peso=" + peso + "]";
    }

}

/*
 * class MiListaDeCajas { MiLista Caja //metodo añadir caja a mi lista //meotodo iterar sobre la lista y devolver el
 * contenido de cada caja }
 */

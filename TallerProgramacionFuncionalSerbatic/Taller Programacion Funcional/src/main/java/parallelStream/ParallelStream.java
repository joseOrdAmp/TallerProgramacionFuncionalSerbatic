package parallelStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import personas.Gender;
import personas.Person;

public class ParallelStream {
    
    
    public static void main(String[] args) {
        Person p1 = new Person("andres",10, Gender.MALE);
        Person p2 = new Person("juan",12, Gender.MALE);
        Person p3 = new Person("pedro",30, Gender.MALE);
        Person p4 = new Person("manuel",26, Gender.MALE);
        
        List<Person> listaPersonas = Arrays.asList(p1,p2,p3,p4);
        
        Consumer <Person> consumerBBDD = (x)-> {
            ApiFalsa.apiFalsamMetodo1BuscarAltura(x);
            ApiFalsa.apiFalsamMetodo2BuscarTrabajo(x);
            ApiFalsa.apiFalsamMetodo3BuscarSueldo(x);
        };
        
        long startTime = System.nanoTime();
                
        listaPersonas.stream().forEach(consumerBBDD);
        
        long stopTime = System.nanoTime();
        
        long resStream = TimeUnit.SECONDS.convert(stopTime - startTime, TimeUnit.NANOSECONDS);
        System.out.println("Stream: "+ resStream);
        
        
        
        startTime = System.nanoTime();
        
        listaPersonas.parallelStream().forEach(consumerBBDD);
        
        stopTime = System.nanoTime();
        long resStreamParallel = TimeUnit.SECONDS.convert(stopTime - startTime, TimeUnit.NANOSECONDS);
        System.out.println("ParallelStream: "+ resStreamParallel);
        
        
        System.out.println("\n\n***Consumer con hilos:***\n");
        
        Consumer <Person> consumerBBDDHilos = (x)-> {
            ExecutorService service = Executors.newFixedThreadPool(3);
            List<Callable<Object>> hilos = new ArrayList<Callable<Object>>(3);
            hilos.add(Executors.callable(() -> ApiFalsa.apiFalsamMetodo1BuscarAltura(x)));
            hilos.add(Executors.callable(() -> ApiFalsa.apiFalsamMetodo2BuscarTrabajo(x)));
            hilos.add(Executors.callable(() -> ApiFalsa.apiFalsamMetodo3BuscarSueldo(x)));

            try {
                List<Future<Object>> answer = service.invokeAll(hilos);//Lanza hilos y espera a que terminen
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        
        
        startTime = System.nanoTime();
        
        listaPersonas.stream().forEach(consumerBBDDHilos);
        
        stopTime = System.nanoTime();
        
        long resStreamConHilos = TimeUnit.SECONDS.convert(stopTime - startTime, TimeUnit.NANOSECONDS);
        System.out.println("Stream + consumerHilos: "+ resStreamConHilos);
        
        
        
        startTime = System.nanoTime();
        
        listaPersonas.parallelStream().forEach(consumerBBDDHilos);
        
        stopTime = System.nanoTime();
        long resStreamParallelConHilos = TimeUnit.SECONDS.convert(stopTime - startTime, TimeUnit.NANOSECONDS);
        System.out.println("ParallelStream + consumerHilos: "+ resStreamParallelConHilos);
        
        
        System.out.println("\n\n\nRESULTADOS:");
        System.out.println("Stream                  - " + resStream);
        System.out.println("StreamParallel          - " + resStreamParallel);
        System.out.println("Stream + hilos          - " + resStreamConHilos);
        System.out.println("StreamParallel + hilos  - " + resStreamParallelConHilos);
        
    }
}

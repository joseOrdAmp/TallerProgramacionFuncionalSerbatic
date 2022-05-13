package parallelStream;

import personas.Person;

public class ApiFalsa {
    
    //Esto es un ejemplo de llamadas a base de datos que pueden tardar un tiempo en procesarse
    //Tambien podrian ser llamadas a metodos de otros servicios externos
    //Los resultados de los set son irrelevantes lo importante es el tiempo que tarda en procesarse y como podemos paliarlo usando un streamparallel.
    
    public static void apiFalsamMetodo1BuscarAltura(Person p) {
        try {
            Thread.sleep(2000);
            p.setAltura((int)(100+Math.random()*100));
            System.out.println("Se ha insertado la altura de " + p.getName());
        }
        catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static void apiFalsamMetodo2BuscarTrabajo(Person p) {
        try {
            Thread.sleep(3000);
            p.setTrabajo("Carpintero");
            System.out.println("Se ha insertado el trabajo de " + p.getName());
        }
        catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static void apiFalsamMetodo3BuscarSueldo(Person p) {
        try {
            Thread.sleep(4000);
            p.setSueldo((int)(5000+Math.random()*10000));
            System.out.println("Se ha insertado el sueldo de " + p.getName());
        }
        catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

package b_interfascesFuncionales;
package interfascesFuncionales;


@FunctionalInterface
interface InterfazFuncional1 <T,U>{
    boolean test(T t,U u);
}

//Se le puede poner la anotacion @FunctionalInterface o no ponerla es irrelevante pero
//Ayuda a saber si es una interfaz funcional o no, ver ejemplo de abajo con una interfaz que no es funcional 
interface InterfazFuncional2 <U>{
    boolean test(U u);
    
    static void metodo() {
        System.out.println("Esta interfaz es funcional y acepta lambdas en su metodo test.");
    }
}


interface InterfazFuncional3 <U>{
    boolean otroNombre(U u);
    
    default void metodoDefault() {
        System.out.println("Esta interfaz es funcional y acepta lambdas en su metodo otroNombre.");
    }
    
    static void metodo() {
        System.out.println("Esta interfaz es funcional y acepta lambdas en su metodo otroNombre.");
    }
}


@FunctionalInterface // Si le ponemos la anotacion y no es una interfaz funcional correcta da error de compilado
interface NOInterfazFuncionalNO <U>{
    boolean otroNombre(U u);
    
    boolean otroNombre2(U u);
    
    static void metodo() {
        System.out.println("Esta interfaz NO es funcional.");
    }
}

//Podemos no ponersela aun asi esta interfaz no se podria usar como interfaz funcional
interface NOInterfazFuncional2NO <U>{
    boolean otroNombre(U u);
    
    boolean otroNombre2(U u);
    
    static void metodo() {
        System.out.println("Esta interfaz NO es funcional.");
    }
}

package b_interfascesFuncionales;
package interfascesFuncionales;


public class Diapositiva16 {
    public static void main(String[] args) {
        
    InterfazPrueba1<Integer> interfazDePrueba1= x->x+1;
    InterfazPrueba1<Integer> interfazDePrueba2= (x)->x+1;
    InterfazPrueba1<Integer> interfazDePrueba3= (Integer x)->x+1;
    
    InterfazPrueba1<Integer> interfazDePruebaIncorrecta4  = (String x)->x.length(); //La interfaz se declaro como Integer!
    InterfazPrueba1<Integer> interfazDePruebaIncorrecta5  =  x->x.length();//Se ha declarado el parametro como integer no puede usar un metodo de una string..
   
    
    InterfazPrueba1<String> interfazDePruebaIncorrecta6  = (String x)->x.length();
    InterfazPrueba1<String> interfazDePruebaIncorrecta7  = x->x.length();

    
    InterfazPrueba2<String> interfazDePrueba8= (String x)-> x.concat("123");
    InterfazPrueba2<String> interfazDePrueba9= (String x)-> x.length();//! El tipo de retorno es String no int!
    
    InterfazPrueba3<String,Integer> interf = (var1,var2) -> var1.length()+var2;
    
    }
}


interface InterfazPrueba1<T>{
    T test(T t);
}

interface InterfazPrueba2 <T>{
    String test(T t);
}

interface InterfazPrueba3 <T,U>{
    Integer test(T t,U u);
}
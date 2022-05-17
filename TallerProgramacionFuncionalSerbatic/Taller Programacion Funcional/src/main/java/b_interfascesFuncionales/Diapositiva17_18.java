package b_interfascesFuncionales;

import java.util.function.Predicate;

public class Diapositiva17_18 {

    public static void main(String[] args) {
        Predicate<String>  pred= var -> var.contains("hola");
        
        System.out.println(pred.test("hola que tal"));
        System.out.println(pred.test("que tal"));
    }
}

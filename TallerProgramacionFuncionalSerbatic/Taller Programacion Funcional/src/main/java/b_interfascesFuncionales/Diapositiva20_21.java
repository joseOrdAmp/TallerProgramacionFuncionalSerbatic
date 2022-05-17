package b_interfascesFuncionales;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import personas.Gender;
import personas.Person;

public class Diapositiva20_21 {

    public static void main(String[] args) {


        
        Supplier<Double> randomSupplier = () ->(Math.random() * 1000D);
        
        System.out.println(randomSupplier.get());
        System.out.println(randomSupplier.get());
        System.out.println(randomSupplier.get());
        
        
    }
}

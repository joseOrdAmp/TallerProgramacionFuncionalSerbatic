package b_introduccion_generics;

import java.util.ArrayList;
import java.util.HashMap;

public class Diapositiva4 {
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        names.add("marty");
        names.add("antonio");
        
        String n = names.get(0);
        
        
        Long l = (Long)names.get(0);//Exception
        
    }
}

package a_introduccion_generics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Diapositiva3 {
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        names.add("marty");
        names.add("antonio");
        
        String n = (String)names.get(0);
        
        
        //Long l = (Long)names.get(0);//Exception
        
        
    }
}

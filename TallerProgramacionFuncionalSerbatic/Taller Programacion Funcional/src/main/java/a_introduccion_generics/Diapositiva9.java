package a_introduccion_generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Diapositiva9 {
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        
        HashMap<String,Integer> m1 = new HashMap<String,Integer>(); //Redundante
        
        HashMap<String,Integer> m2 = new HashMap<>(); //Menos Redundante

        Map<String,Integer> m3 = new HashMap<>(); //Manera correcta
        Map<String,Integer> m4 = new TreeMap<>(); //Manera correcta
        ejemplo(m3);
        ejemplo(m4);
        ejemplo2(m3);
        ejemplo2(m4);
        
        ArrayList<String> l1 = new ArrayList<String>(); //Redundante
        
        ArrayList<String> l2 = new ArrayList<>(); //Menos Redundante
        
        List<String> l3 = new ArrayList<>(); //Manera correcta
    }
    
    
    private static void ejemplo(Map<String,Integer> m) {//Manera correcta
        m.put("asd", 1);
    }
    private static void ejemplo2(HashMap<String,Integer> m) {//Manera menos correcta
        m.put("asd", 1);
    }
}

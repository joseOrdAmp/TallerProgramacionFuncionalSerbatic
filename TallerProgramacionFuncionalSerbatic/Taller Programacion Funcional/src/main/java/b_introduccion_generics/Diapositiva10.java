package b_introduccion_generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Diapositiva10 {
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<String> listaString1 = new ArrayList<>();
        List<String> listaString2 = new ArrayList<>();
        
        List<Integer> listaInteger = new ArrayList<>();
        
        copiarListas(listaString1,listaString2);
        copiarListas(listaString1,listaInteger);
        
        String x  = getPrimerValor(listaString1);
        Integer y = getPrimerValor(listaInteger);
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

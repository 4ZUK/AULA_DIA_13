package aaaaa;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

public String map;
    public static void main(String[] args) {

        Map<Integer, String>  map = new HashMap<>();
        map.put(0, "Ovos");
        map.put(1, "Agua");
        map.put(2, "Escopeta");
        map.put(3, "Cavalo");
        map.put(4, "Dentista");
        map.put(5, "Fogo");

        for (Integer Map : map.keySet()) {
            String valor = map.get(2);
            System.out.println(valor);
        }
    }


}

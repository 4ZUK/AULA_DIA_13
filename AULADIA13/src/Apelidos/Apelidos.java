package Apelidos;

import java.util.HashMap;
import java.util.Map;

public class Apelidos {


    public static void main(String[] args) {

        Map<String, String>  map = new HashMap<>();
        map.put("Joao", "Juan, Fissura, Maromba");
        map.put("Miguel", "Night Watch, Bruce Wayne, Tampinha");
        map.put("Maria", "Wonder Woman, Mary, Marilene");
        map.put("Lucas", "Lukinha, Jorge, George");


        for (String Map : map.keySet()) {
            String valor = map.get(map);
            System.out.println(map);
        }
    }


}

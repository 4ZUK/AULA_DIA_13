package Conjunto;

import java.util.HashSet;
import java.util.Set;

public class Conj {
    public static void main(String[] args) {
        Set<Integer> grupo = new HashSet<>();

        grupo.add(1);
        grupo.add(5);
        grupo.add(5);
        grupo.add(6);
        grupo.add(7);
        grupo.add(8);
        grupo.add(8);
        grupo.add(8);

        for (Integer valor :grupo) {
            System.out.println(valor+"-"+grupo);
        }
    }
}

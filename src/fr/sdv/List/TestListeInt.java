package fr.sdv.List;

import java.util.ArrayList;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<Integer>();

        liste.add(-1);
        liste.add(5);
        liste.add(7);
        liste.add(3);
        liste.add(-2);
        liste.add(4);
        liste.add(8);
        liste.add(5);

        for(Object o : liste) {
            System.out.println(o);
        }

        System.out.println(liste.size());

        int max = (int) liste.get(0);
        for(int o : liste) {
            if(o > max){
                max = o;
            }
        }
    }
}

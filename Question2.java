import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.*;

 class Main {

    public static void main(String[] args) {

        String[] animals = { "Cat", "Dog", "Cow", "Hamster", "Horse", "Lion", "Bear", "Rhino", "Elephant", "Tiger", "Eagle"};
        // Creating an ArrayList of String
        LinkedList<String> newAnimals = new LinkedList<String>();

        for(int i = 0; i < animals.length; i++) {
            newAnimals.add(animals[i]);
        }

        System.out.println(newAnimals);
        System.out.println(newAnimals.size());

        for(int j = newAnimals.size() - 1; j >= 0; j--) {
            String temp = lowerCase(newAnimals.get(j));
            newAnimals.remove(j);
            newAnimals.add(j, temp);
            System.out.print(newAnimals.get(j) + " ");
        }
        
        System.out.println(newAnimals.size());
    }

    public static String lowerCase(String s) {
        String replace;
        replace = s.toLowerCase();
        return replace;
    }

}

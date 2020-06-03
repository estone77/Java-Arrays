import java.util.ArrayList;
import java.util.List;

 class Main {

    public static void main(String[] args) {

        String[] animals = { "Cat", "Dog", "Cow", "Hamster", "Horse", "Lion", "Bear", "Rhino", "Elephant", "Tiger", "Eagle"};
        // Creating an ArrayList of String
        ArrayList<String> newAnimals = new ArrayList<>();

        for(int i = 0; i < animals.length; i++) {
            newAnimals.add(animals[i]);
        }

        System.out.println(newAnimals);
        System.out.println(newAnimals.size());

        String[] deltAnimals = {"Hamster", "Rhino", "Tiger"};

        ArrayList<String> removeAnimals = new ArrayList<>();

        for(int k = 0; k < deltAnimals.length; k++) {
            removeAnimals.add(deltAnimals[k]);
        }

        for(int j = 0; j < removeAnimals.size(); j++) {
            for(int h = 0; h < newAnimals.size(); h++) {
                if(newAnimals.get(h).equals(removeAnimals.get(j))) {
                    newAnimals.remove(h);
                }
            }
        }

        System.out.println(newAnimals);
        System.out.println(newAnimals.size());

    }
}

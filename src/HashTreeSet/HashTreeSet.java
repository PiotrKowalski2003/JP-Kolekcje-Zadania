package HashTreeSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 1. Zaimplementuj program, który przyjmuje od użytkownika ciąg liczb i przechowuje je w zbiorze typu HashSet i TreeSet.
 * Następnie wyświetl różnice między HashSet a TreeSet w kontekście kolejności elementów.
 * */


public class HashTreeSet {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        System.out.println("Podaj ciag liczb, ktore sa oddzielone spacajami (np. 8 9 17 20 21 28 33 )");
        String input = scanner.nextLine();
        String[] inputArray = input.trim().split("\\s+");

        // Dodawanie tablicy liczb do hashSet i treeSet
        for (String s : inputArray) {
            try{
                int number = Integer.parseInt(s);
                hashSet.add(number);
                treeSet.add(number);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        // Kolejnosc
        System.out.println("HashSet - elementy: " +  hashSet);
        System.out.println("Liczba unikalnych elementów : " + hashSet.size());
        System.out.println(" - - - - - - - - - - - - - - -");
        System.out.println("TreeSet - elementy: " +  treeSet);
        System.out.println("Liczba unikalnych elementów : " + treeSet.size());
        System.out.println(" - - - - - - - - - - - - - - -");
        System.out.println("HashSet - elementy moga wystapic w losowej kolejnosci.");
        System.out.println("TreeSet - elementy sa posortowane w kolejnosci rosnacej.");

        scanner.close();
    }
}

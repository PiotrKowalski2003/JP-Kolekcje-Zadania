package ArrayLinkedLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * 02.Stwórz program, który dodaje, usuwa i modyfikuje elementy w dwóch listach typu ArrayList i LinkedList. N
 * astępnie zmierz czas wykonywania tych operacji i porównaj wyniki.
 */

public class ListsPerformance {
    private static final int elementCount = 25000;
    private static final Random random = new Random();

    private static void addToEnd(List<Integer> arrayList, List<Integer> linkedList) {
        // ArrayList
        long startTime = System.nanoTime();
        for(int i=0; i < elementCount; i++){
            arrayList.add(i);
        }
        long arrayListTime = System.nanoTime() - startTime;
        System.out.println("Arraylist: " + arrayListTime + " nanoseconds");

        // LinkedList
        startTime = System.nanoTime();
        for(int i=0; i < elementCount; i++){
            linkedList.add(i);
        }
        long linkedListTime = System.nanoTime() - startTime;
        System.out.println("LinkedList: " + linkedListTime + " nanoseconds");

    }

    private static void addToStart(List<Integer> arrayList, List<Integer> linkedList) {

        // ArrayList
        long startTime = System.nanoTime();
        for(int i=0; i < elementCount; i++){
            arrayList.add(0, i);
        }
        long arrayListTime = System.nanoTime() - startTime;
        System.out.println("Arraylist: " + arrayListTime + " nanoseconds");

        // Linkedlist
        startTime = System.nanoTime();
        for(int i=0; i < elementCount; i++){
            linkedList.add(0, i);
        }
        long linkedListTime = System.nanoTime() - startTime;
        System.out.println("LinkedList: " + linkedListTime + " nanoseconds");
    }

    private static void removeFromEnd(List<Integer> arrayList, List<Integer> linkedList) {
        // ArrayList
        long startTime = System.nanoTime();
        for(int i=0; i < elementCount; i++){
            if(!arrayList.isEmpty()){
                arrayList.remove(arrayList.size()-1);
            }
        }
        long arrayListTime = System.nanoTime() - startTime;
        System.out.println("Arraylist: " + arrayListTime + " nanoseconds");

        // LinkedLList
        startTime = System.nanoTime();
        for(int i=0; i < elementCount; i++){
            if(!linkedList.isEmpty()){
                linkedList.remove(linkedList.size()-1);
            }
        }
        long linkedListTime = System.nanoTime() - startTime;
        System.out.println("LinkedList: " + linkedListTime + " nanoseconds");

    }

    private static void removeFromStart(List<Integer> arrayList, List<Integer> linkedList) {
        // ArrayList
        long startTime = System.nanoTime();
        for(int i=0; i < elementCount; i++){
            if(!arrayList.isEmpty()){
                arrayList.remove(0);
            }
        }
        long arrayListTime = System.nanoTime() - startTime;
        System.out.println("Arraylist: " + arrayListTime + " nanoseconds");

        // LinkedList
        startTime = System.nanoTime();
        for(int i=0; i < elementCount; i++){
            if(!linkedList.isEmpty()){
                linkedList.remove(0);
            }
        }
        long linkedListTime = System.nanoTime() - startTime;
        System.out.println("LinkedList: " + linkedListTime + " nanoseconds");
    }

    private static void randomElementMultiplication(List<Integer> arrayList, List<Integer> linkedList) {

        // ArrayList
        long startTime = System.nanoTime();
        for(int i=0; i < elementCount; i++){
            if(!arrayList.isEmpty()){
                int randomIndex = random.nextInt(arrayList.size());
                int currentValue = arrayList.get(randomIndex);
                arrayList.set(randomIndex, currentValue * 2);
            }
        }
        long arrayListTime = System.nanoTime() - startTime;
        System.out.println("Arraylist: " + arrayListTime + " nanoseconds");

        // LinkedList
        startTime = System.nanoTime();
        for(int i=0; i < elementCount; i++){
            if(!linkedList.isEmpty()){
                int randomIndex = random.nextInt(linkedList.size());
                int currentValue = linkedList.get(randomIndex);
                linkedList.set(randomIndex, currentValue * 2);
            }
        }
        long linkedListTime = System.nanoTime() - startTime;
        System.out.println("Linkedlist: " + linkedListTime + " nanoseconds");
    }


    public static void main(String[] args) {

        // tworzenie lists
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // dodawanie elementow na koniec
        System.out.println("Dodawanie elementow w listach (od konca): ");
        addToEnd(arrayList, linkedList);

        // dodawanie elementow na poczatek
        System.out.println("\nDodawanie elementow w listach (od poczatku): ");
        addToStart(arrayList, linkedList);

        // usuwanie elementow od konca
        System.out.println("\nUsuwanie elementow (od konca):");
        removeFromEnd(arrayList, linkedList);

        // usuwanie elementow od poczatku
        System.out.println("\nUsuwanie elementow (od poczatku):");
        removeFromStart(arrayList, linkedList);

        // mnozenie elementow w listach
        System.out.println("\nMnozenie elementow w listach:");
        randomElementMultiplication(arrayList, linkedList);
    }
}

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GenericCollectionsExample {
    public static void main(String[] args) {
        // Using ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");

        System.out.println("ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // Using HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Dog");
        hashSet.add("Cat");
        hashSet.add("Elephant");
        hashSet.add("Bear");

        System.out.println("\nHashSet:");
        for (String animal : hashSet) {
            System.out.println(animal);
        }

        // Using HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 25);
        hashMap.put("Jane", 30);
        hashMap.put("Tom", 35);
        hashMap.put("Alice", 28);

        System.out.println("\nHashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }
    }
}

import java.util.*;


public class HashMapPrac {

    public static void main(String[] args) {
        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
        // Creates an empty LinkedHashMap

        // Adding Key value Pairs to the LinkedHashMap.
        lhm.put("one","Ram");
        lhm.put("two","Krishna");
        lhm.put("three","Shayam");


        // Printing the Entries.

        System.out.println(lhm); 

        // Getting value from Key
        System.out.println(lhm.get("two"));

        // Check if the value exists in the LinkedHashMap
        //System.out.println("Contains values Pikachu : "+lhm.containsValue("Pikachu"));

        //Updating a value from Key
        lhm.put("three", "Sita");
        System.out.println("Now the value on key three is : " + lhm.get("three"));
        

        //Removing value from LinkedHashMap
        lhm.remove("three");
        System.out.println(lhm);


        // Iterating for traversal.

        for (Map.Entry <String, String> mapElement : lhm.entrySet()){
            String key = mapElement.getKey();
            String value = mapElement.getValue();

            System.out.println(key + " : " + value);

        }

    }
}    
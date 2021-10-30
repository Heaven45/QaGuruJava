package guru.qa.lesson15;

import java.util.*;

public class Maps {

    public static void main(String[] args) {
       Map<Integer, String> cities = new HashMap<Integer, String>();
       cities.put(1, "Helsinki");
       cities.put(2, "Prague");
       cities.put(3, "Paris");
       cities.put(4, "Stockholm");

       System.out.println(cities.get(3));

       Set<Integer> keys = cities.keySet();
       System.out.println(keys);

       Collection<String> values = cities.values();
       System.out.println(values);

       cities.replace(3, "Oslo");
       Collection<String> newValues = cities.values();
       System.out.println(values);

       cities.remove(3);
       for (Map.Entry<Integer, String> item : cities.entrySet()) {
           System.out.printf("Key: %d Value: %s \n", item.getKey(), item.getValue());
       }
    }
}

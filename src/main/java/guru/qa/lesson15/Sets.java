package guru.qa.lesson15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public static void main(String[] args) {
        Set<String> countryHashSet = new HashSet<>();
        Set<String> linkedStringSet = new LinkedHashSet<>();
        Set<String> treeStringSet = new TreeSet<>();

        countryHashSet.add("Helsinki");
        countryHashSet.add("Prague");
        countryHashSet.add("Paris");
        countryHashSet.add("Stockholm");

        System.out.println("Размер HashSet = " + countryHashSet.size());
        System.out.println(countryHashSet.contains("Paris"));

        String[] myArray;
        myArray = countryHashSet.toArray(new String[countryHashSet.size()]);
        System.out.println(Arrays.toString(myArray));
    }
}

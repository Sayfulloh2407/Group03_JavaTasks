package week_10;

import java.util.*;

public class Ümit {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,2,1,0,6,4,3));

        sortTheListAscending(list);
        System.out.println(list); //[0, 1, 2, 3, 4, 5, 6]

        System.out.println("-------------------------------------------");

        sortTheListDescending(list);
        System.out.println(list); //[6, 5, 4, 3, 2, 1, 0]

        System.out.println("-------------------------------------------");

        Map<Integer, String> map = new HashMap<>();
        map.put(3,"Burak");
        map.put(2,"Ali");
        map.put(1,"Cem");

        System.out.println(sortByValues(map));


    }



    /*
    TASK1 : ArrayList - sorting in ascending
    Write a method that can sort the ArrayList in Ascending order without using
    the sort method.
 */
    public static void sortTheListAscending(ArrayList<Integer> list) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element in the unsorted part of the list
            for (int j = i + 1; j < n; j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
    }




    /*
    TASK2: ArrayList - sorting in descending order
    Write a method that can sort the ArrayList in descending order without
    using the sort method.
     */

    public static void sortTheListDescending(ArrayList<Integer> list) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            // Find the index of the minimum element in the unsorted part of the list
            for (int j = i + 1; j < n; j++) {
                if (list.get(j) > list.get(maxIndex)) {
                    maxIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = list.get(i);
            list.set(i, list.get(maxIndex));
            list.set(maxIndex, temp);
        }
    }



    /*
    Map - Sort the map by values
    Write a method that can sort the Map by values
     */

    public static Map<Integer, String> sortByValues(Map<Integer, String> unsortedMap) {
        // Convert the Map to a List of Map entries
        List<Map.Entry<Integer, String>> list = new LinkedList<>(unsortedMap.entrySet());


        // Sort the List based on values using a custom Comparator
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                // Use compareTo to compare the values for sorting
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        // Create a LinkedHashMap to preserve the order of insertion
        Map<Integer, String> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }



}

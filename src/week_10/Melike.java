package week_10;

import java.util.*;

public class Melike {
    public static void main(String[] args) {

        //ArrayList - sorting in ascending
        // Write a method that can sort the ArrayList in Ascending order without using the sort method.

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList( 208, 43, 104, 75, 16, 100));
        System.out.println("sortArrayListASC(list1) = " + sortArrayListASC(list1));

        // ArrayList - sorting in descending order
        // Write a method that can sort the ArrayList in descending order without using the sort method.
        System.out.println("sortArrayListDSC(list1) = " + sortArrayListDSC(list1));

        // Map - Sort the map by values
        // Write a method that can sort the Map by values
        Map<String,Integer> ages = new LinkedHashMap<>();
        ages.put("Melike",31);
        ages.put("Adam",3);
        ages.put("Samil",32);

        System.out.println("sortMap(ages) = " + sortMap(ages));



    }



    public static ArrayList<Integer> sortArrayListASC(ArrayList<Integer> list1) {


        for (int i = 0; i < list1.size(); i++) {
            int tem;
            for (int j = i; j < list1.size(); j++) {

                if (list1.get(i) > list1.get(j)) {

                    tem = list1.get(i);
                    list1.set(i,list1.get(j));
                    list1.set(j,tem);
                }
            }
        }

        return list1;

    }

    private static ArrayList<Integer> sortArrayListDSC(ArrayList<Integer> list1) {

        for (int i = 0; i < list1.size(); i++) {
            int tem;
            for (int j = i; j < list1.size(); j++) {

                if (list1.get(i) < list1.get(j)) {

                    tem = list1.get(i);
                    list1.set(i,list1.get(j));
                    list1.set(j,tem);
                }
            }
        }

        return list1;


    }

    private static Map<String,Integer> sortMap(Map<String, Integer> ages) {

        TreeMap<String,Integer> result = new TreeMap<>();
        result.putAll(ages);

        return result;

    }

}

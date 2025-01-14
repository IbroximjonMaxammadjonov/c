package org.example;

import java.util.*;

public class SetLearning {
    static Integer[] nums = {1,2,3,4,3,2,3,2,4,5,66,7,8};
    static Integer[] nums1 = {1,2,3,4,3,2,3,2,4,5,66,7,8,9,10};
    static String[] strings = {"Banana", "Monkey", "Giraffe", "Uzbekistan", "Army", "Banana"};

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(List.of(nums));
        System.out.println(set);
        System.out.println(Collections.max(set));

        Set<Integer> set1 = new HashSet<>(List.of(nums));
        Set<Integer> set2 = new HashSet<>(List.of(nums1));
        set1.retainAll(set2);
        System.out.println(set1);

        Set<String> strings1 = new TreeSet<>(List.of(strings));
        System.out.println(strings1);
        System.out.println(strings1.size());

        String text = "Men har kuni maktabga boraman, qaytishda esa non olib olaman";
        String[] textArray = text.toLowerCase().replace("[^a-z ]", "").split("\\s+");
        Set<String> textSet = new HashSet<String>(List.of(textArray));
        System.out.println(textSet);
        System.out.println(textSet.size());
    }
}

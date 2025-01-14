package org.example;

import java.util.*;

public class ListLearning {

    public static void main(String[] args) {

        //2 ta o'ngga shift qilish
        List<Integer> numbers = new ArrayList<>(Utils.firstList);
        List<Integer> last = new ArrayList<>(numbers.subList(2,numbers.size()));
        List<Integer> first = new ArrayList<>(numbers.subList(0,2));
        last.addAll(first);
        System.out.println(last);

        // listdan eng uzun so'zni topish
        List<String> strings = new ArrayList<>(Utils.fruits);
        String longestString = "";
        for (String string: strings){
            if(string.length()>longestString.length()){
                longestString = string;
            }
        }
        System.out.println(longestString);




    }

    private static List<Integer> findIntersection(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>(list1);

        // `retainAll` yordamida umumiy elementlarni qoldirish
        result.retainAll(list2);

        return result;
    }
}

class Fruit implements Comparable<Fruit> {
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Fruit fruit) {
        return this.name.compareTo(fruit.name);
    }

    @Override
    public String toString() {
        return name;
    }
}

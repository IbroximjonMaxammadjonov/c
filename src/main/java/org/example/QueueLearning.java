package org.example;

import javax.xml.transform.Source;
import java.sql.Statement;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueLearning {

    public static void main(String[] args) {
        Queue<String> queue =new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");

        System.out.println(queue);
        System.out.println("first element: " + queue.peek());

        System.out.println("first element is deleted: " + queue.poll());
        System.out.println(queue);

        System.out.println(queue.isEmpty());

        String text = "Java is fun to learn";
        String[] words = text.split("\\s+");
        Queue<String> wordsQueue = new LinkedList<>(Arrays.asList(words));
        System.out.println(wordsQueue);
        wordsQueue.offer("hello");
        System.out.println(wordsQueue);


        Queue<Integer> q = new LinkedList<>(Arrays.asList(10, 20, 30, 40));
        Stack<Integer> stack = new Stack<>();
        for (Integer num: q){
            stack.push(num);
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + (stack.isEmpty() ? "" : ", "));
        }
    }
}

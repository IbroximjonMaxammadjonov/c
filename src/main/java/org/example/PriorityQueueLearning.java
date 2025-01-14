package org.example;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueLearning {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        pq.offer(40);
        pq.offer(50);
        pq.offer(23);
        System.out.println(pq);

        PriorityQueue<Task> taskQueue = new PriorityQueue<>(Comparator.comparingInt(task -> task.priority));
        taskQueue.offer(new Task("Task1", 3));
        taskQueue.offer(new Task("Task2", 1));
        taskQueue.offer(new Task("Task3", 2));
        System.out.println(taskQueue);



    }
}

class Task{
    int priority;
    String name;
    public Task(String name, int priority){
        this.name = name;
        this.priority = priority;
    }
    @Override
    public String toString() {
        return name + "(Priority: " + priority + ")";
    }
}
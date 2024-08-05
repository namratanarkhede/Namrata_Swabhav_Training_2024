package com.aurionpro.queue;

import java.util.PriorityQueue; 

public class PriorityQueueExample { 
    public static void main(String[] args) { 
        PriorityQueue<Integer> priorityqueue = new PriorityQueue<>(); 
 
        priorityqueue.add(10);
        priorityqueue.add(20);
        priorityqueue.add(5); 
        priorityqueue.add(15); 
 
        System.out.println("PriorityQueue: " + priorityqueue); 
 
        while (!priorityqueue.isEmpty()) { 
            System.out.println("Polled element: " + priorityqueue.poll()); 
        } 
    } 
}
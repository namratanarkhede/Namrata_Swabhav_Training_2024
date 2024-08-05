package com.aurionpro.queue;

import java.util.ArrayList; 
import java.util.List; 
 
public class ArrayQueueExample { 
    public static void main(String[] args) { 
        List<Integer> queue = new ArrayList<>(); 
 
        queue.add(10); 
        queue.add(20); 
        queue.add(30); 
 
        System.out.println("ArrayList as Queue: " + queue); 
 
        while (!queue.isEmpty()) { 
            System.out.println("Polled element: " + queue.remove(0)); 
        } 
    } 
}
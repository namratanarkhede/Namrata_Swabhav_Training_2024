package com.aurionpro.queue;
import java.util.ArrayDeque; 
import java.util.Deque; 
 
public class DequeExample { 
    public static void main(String[] args) { 
        Deque<String> deque = new ArrayDeque<>(); 
 
        deque.addFirst("First"); 
        deque.addLast("Last"); 
        deque.addFirst("Second"); 
 
        System.out.println("Deque: " + deque); 
 
        System.out.println("Removed from front: " + deque.removeFirst()); 
        System.out.println("Removed from end: " + deque.removeLast()); 
    } 
}
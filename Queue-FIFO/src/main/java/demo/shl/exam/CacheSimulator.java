package demo.shl.exam;

import java.util.Scanner;

/**
 * FIFO Cache Simulator
 * Uses a Queue (Linked List) to simulate First-In-First-Out cache replacement
 */
public class CacheSimulator {

    /**
     * Node class for linked list implementation of Queue
     */
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Queue implementation using linked list (FIFO)
     */
    static class Queue {
        private Node front;
        private Node rear;
        private int size;

        public Queue() {
            this.front = null;
            this.rear = null;
            this.size = 0;
        }

        /**
         * Add an element to the queue (enqueue)
         */
        public void enqueue(int value) {
            Node newNode = new Node(value);
            if (rear == null) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
            size++;
        }

        /**
         * Remove the oldest element from the queue (dequeue)
         */
        public int dequeue() {
            if (front == null) {
                throw new IllegalStateException("Queue is empty");
            }
            int value = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            size--;
            return value;
        }

        /**
         * Check if the queue contains a value
         */
        public boolean contains(int value) {
            Node current = front;
            while (current != null) {
                if (current.data == value) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        /**
         * Get the current size of the queue
         */
        public int getSize() {
            return size;
        }

        /**
         * Check if the queue is empty
         */
        public boolean isEmpty() {
            return size == 0;
        }
    }

    /**
     * Simulate FIFO cache and count cache misses
     *
     * @param pageRequests     Array of page requests
     * @param maxCacheSize     Maximum cache size
     * @return                 Number of cache misses
     */
    public static int countCacheMisses(int[] pageRequests, int maxCacheSize) {
        Queue cache = new Queue();
        int cacheMisses = 0;

        for (int page : pageRequests) {
            if (!cache.contains(page)) {
                // Cache miss
                cacheMisses++;

                // If cache is full, remove the oldest page (FIFO)
                if (cache.getSize() >= maxCacheSize) {
                    cache.dequeue();
                }

                // Add the new page to cache
                cache.enqueue(page);
            }
        }

        return cacheMisses;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of page requests
        int n = scanner.nextInt();

        // Read page requests
        int[] pageRequests = new int[n];
        for (int i = 0; i < n; i++) {
            pageRequests[i] = scanner.nextInt();
        }

        // Read max cache size
        int maxCacheSize = scanner.nextInt();

        // Calculate and print cache misses
        int result = countCacheMisses(pageRequests, maxCacheSize);
        System.out.println(result);

        scanner.close();
    }
}
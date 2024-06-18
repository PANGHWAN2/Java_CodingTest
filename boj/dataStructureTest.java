package boj;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class dataStructureTest {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        testArrayList(bw);

        testLinkedList(bw);

        testHashMap(bw);

        testHashSet(bw);

        testStack(bw);

        testQueue(bw);

        testPriorityQueue(bw);

        testDeque(bw);
        bw.flush();
        bw.close();
    }

    public static void testArrayList(BufferedWriter bw) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        bw.write("ArrayList Test: \n");
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add(1, "grape");
        bw.write("First element : " + list.get(0) + "\n");
        list.set(2, "pear");
        list.remove(3);
        list.remove("banana");
        bw.write("List size " + list.size() + "\n");
        for (String item : list) {
            bw.write("Item " + item + "\n");
        }
        bw.write("\n");

    }

    public static void testLinkedList(BufferedWriter bw) throws IOException {
        bw.write("LinkedList Test: \n");
        LinkedList<String> list = new LinkedList<>();
        list.add("apple");
        list.add("banana");
        list.addFirst("orange");
        bw.write("First element: " + list.get(0) + "\n");
        list.removeLast();
        for (String item : list) {
            bw.write("Item " + item + "\n");
        }
        bw.write("\n");
    }

    public static void testHashMap(BufferedWriter bw) throws IOException {
        bw.write("HashMap Test: \n");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 2);
        map.put("orange", 5);
        bw.write("Apple count: " + map.get("apple") + "\n");
        map.remove("banana");
        for (String key : map.keySet()) {
            bw.write("key: " + key + ", value" + map.get(key) + "\n");
        }
        bw.write("\n");
    }

    public static void testHashSet(BufferedWriter bw) throws IOException {
        bw.write("HashSet Test:\n");
        HashSet<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");
        bw.write("Set contains banana: " + set.contains("banana") + "\n");
        set.remove("orange");
        for (String item : set) {
            bw.write("Item: " + item + "\n");
        }
        bw.write("\n");
    }

    public static void testStack(BufferedWriter bw) throws IOException {
        bw.write("Stack Test: \n");
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        bw.write("Top element: " + stack.peek() + "\n");
        stack.pop();
        while (!stack.isEmpty()) {
            bw.write("Popped " + stack.pop() + "\n");
        }
        bw.write("\n");
    }

    public static void testQueue(BufferedWriter bw) throws IOException {
        bw.write("Queue Test: \n");
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        bw.write("Front element " + queue.peek() + "\n");
        queue.poll();
        while (!queue.isEmpty()) {
            bw.write("Polled: " + queue.poll() + "\n");
        }
        bw.write("\n");
    }

    public static void testPriorityQueue(BufferedWriter bw) throws IOException {
        bw.write("PriorityQueue Test:\n");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(3);
        pq.offer(1);
        pq.offer(2);
        while (!pq.isEmpty()) {
            bw.write("Polled: " + pq.poll() + "\n");
        }
        bw.write("\n");
    }

    public static void testDeque(BufferedWriter bw) throws IOException {
        bw.write("Deque Test: \n");
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);
        while (!deque.isEmpty()) {
            bw.write("Removed: " + deque.removeFirst() + "\n");
        }
        bw.write("\n");
    }
}

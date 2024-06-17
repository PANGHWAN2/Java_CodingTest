package boj;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class dataStructureTest {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        testArrayList(bw);

        // testLinkedList(br);

        // testHashMap(br);

        // testHashSet(br);

        // testStack(br);

        // testQueue(br);

        // testPriiorityQueue(br);

        // testDeque(br);
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
        bw.write("First element : " + list.get(0));
        list.set(2, "pear");
        list.remove(3);
        list.remove("banana");
        bw.write("List size " + list.size());
        for (String item : list) {
            bw.write("Item " + item);
        }
        bw.write("\n");

    }

}

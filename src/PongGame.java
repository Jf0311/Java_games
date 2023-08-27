public class PongGame {

    public static void main(String[] args) {
        GameFrame frame = new GameFrame();
    }
}

























//import javax.xml.stream.events.StartDocument;
//import java.io.StringBufferInputStream;
//import java.util.*;
//import java.util.concurrent.ConcurrentLinkedQueue;
//
//public class Main {
//    public static void main(String[] args) {
////        Stack<String>stack = new Stack<String>();
////
////        System.out.println(stack.empty());
////        stack.push("Mario");
////        stack.push("God Of War");
////        stack.push("CyberPunk");
////        stack.push("COD");
////        stack.push("The Last Of Us");
////
////        System.out.println(stack);
//////       String s =  stack.pop();
////        System.out.println(stack.search("CyberPunk"));
////
//////        System.out.println(s);
//
////        Queue<String> queue = new LinkedList<String>();
////        System.out.println(queue.isEmpty());
////        queue.offer("Karen");
////        queue.offer("Mark");
////        queue.offer("Chad");
////        queue.offer("Steve");
////
////
////        queue.poll();
////        System.out.println(queue.isEmpty());
////        System.out.println(queue);
////
////        Queue<Double> q = new PriorityQueue<>(Collections .reverseOrder());
////        q.offer(2.3);
////        q.offer(3.0);
////        q.offer(3.1);
////        q.offer(2.0);
////        while(!q.isEmpty()) {
////            System.out.println(q.poll());
////        }
////
////        LinkedList<String> linkedList = new LinkedList<String>();
////        linkedList.offer("A");
////        linkedList.offer("B");
////        linkedList.offer("C");
////        linkedList.offer("D");
////        linkedList.offer("F");
////
////        linkedList.add(4, "E");
////        System.out.println(linkedList);
////        linkedList.remove("E");
////        linkedList.offerLast("x");
////        System.out.println("linkedList.peekFirst() = " + linkedList.peekFirst());
////        System.out.println("linkedList.peekFirst() = " + linkedList.peekLast());
////        System.out.println("linkedList = " + linkedList);
////
////        //ArrayList<String>arrayList = new ArrayList<String>();
////
////        DynamicArray dynamicArray = new DynamicArray();
////        dynamicArray.add("A");
////        dynamicArray.add("B");
////        dynamicArray.add("C");
////
////
////        System.out.println(dynamicArray);
////        System.out.println("size: "+ dynamicArray.size);
////        System.out.println("capacity " +dynamicArray.capacity);
////        System.out.println("empty: " + dynamicArray.isEmpty());
////
//
//        LinkedList<Integer> linkedList = new LinkedList<Integer>();
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//
//        long startTime;
//        long endTime;
//        long elapsedTime;
//
//        for (int i = 0; i < 1000000; i++){
//            linkedList.add(i);
//            arrayList.add(i);
//        }
//
//        //****************LinkedList********************
//        startTime = System.nanoTime();
//
////        linkedList.get(0);
////        linkedList.get(500000);
////        linkedList.get(999999);;
////        linkedList.remove(0);
////        linkedList.remove(500000);
//        linkedList.remove(999999);
//
//        //do something
//
//        endTime = System.nanoTime();
//
//        elapsedTime = endTime - startTime;
//
//        System.out.println("LinkedList:\t" + elapsedTime + " ns ");
//
//
//        //****************ArrayList********************
//
//
//        startTime = System.nanoTime();
//
////        arrayList.get(0);
////        arrayList.get(500000);
////        arrayList.get(999999);
////        arrayList.remove(0);
////        arrayList.remove(500000);
//        arrayList.remove(999999);
//
//        //do something
//
//        endTime = System.nanoTime();
//
//        elapsedTime = endTime - startTime;
//
//        System.out.println("ArrayList:\t" + elapsedTime + " ns ");
//
//
//
//
//
//
//    }
//
//}
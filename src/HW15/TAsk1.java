package HW15;

import java.util.*;

public class TAsk1 {
    public static void main(String[] args) {
        listTask();
        setTask();
        queueTask();
        dequeTask();
        mapTask();
    }

    private static void dequeTask() {
        System.out.println("Deque:");
        Deque<String> deque = new ArrayDeque<>();
        fillDeque(deque);
        for (String s : deque) {
            System.out.println(s);
        }
        System.out.println();
        clearDeque(deque);
    }

    private static void clearDeque(Deque<String> deque) {
        Iterator<String> it = deque.iterator();
        while (it.hasNext()) {
            String s = it.next();
            it.remove();
        }
    }

    private static void mapTask() {
        System.out.println("Map:");
        Map<Integer, String> map = new HashMap<>();
        fillMap(map);
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Entry key: " + entry.getKey());
            System.out.println("Entry value: " + entry.getValue());
        }
        System.out.println();
        clearMap(map);
    }

    private static void clearMap(Map<Integer, String> map) {
        for (Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<Integer, String> entry = it.next();
            it.remove();
        }
    }

    private static void queueTask() {
        System.out.println("Queue:");
        Queue<String> queue = new ArrayDeque<>();
        fillQueue(queue);
        for (String s : queue) {
            System.out.println(s);
        }
        System.out.println();
        clearQueue(queue);
    }

    private static void clearQueue(Queue<String> queue) {
        Iterator<String> it = queue.iterator();
        while (it.hasNext()) {
            String s = it.next();
            it.remove();
        }
    }

    private static void setTask() {
        System.out.println("Set:");
        Set<String> set = new HashSet<>();
        fillSet(set);
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println();
        clearSet(set);
    }

    private static void clearSet(Set<String> set) {
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String s = it.next();
            it.remove();
        }
    }

    private static void listTask() {
        System.out.println("List:");
        List<String> list = new ArrayList<>();
        fillList(list);
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println();
        clearList(list);
    }

    private static void clearList(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            it.remove();
        }
    }

    private static void fillDeque(Deque<String> deque) {
        deque.add("four");
        deque.add("three");
        deque.add("two");
        deque.add("one");
    }

    private static void fillMap(Map<Integer, String> map) {
        map.put(1, "key1");
        map.put(2, "key2");
        map.put(3, "key3");
        map.put(4, null);
    }

    private static void fillQueue(Queue<String> queue) {
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");
    }

    private static void fillSet(Set<String> set) {
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
    }

    private static void fillList(List<String> list) {
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
    }
}
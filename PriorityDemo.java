import java.util.*;

class MyCom implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2)
            return 1;
        if (o1 > o2)
            return -1;
        return 0;
    }
}

public class PriorityDemo {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyCom());
        pq.add(50);
        pq.add(75);
        pq.add(10);
        pq.add(7);
        pq.add(40);

        // pq.forEach((x) -> System.out.println(x));

        while (!pq.isEmpty()) {
            // System.out.println(pq.element());
            System.out.println(pq.peek());
            pq.poll();
        }

        // System.out.println(pq.element());
        // System.out.println(pq.peek());
    }
}
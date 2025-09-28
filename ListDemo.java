import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>(List.of(20, 30, 40));
        al.add(5);
        al.add(0, 10);
        al.addAll(0, al2);
        al.add(30);
        // System.out.println(al);
        // System.out.println(al.contains(30));
        // System.out.println(al.indexOf(30));
        // System.out.println(al.lastIndexOf(30));
        // al.forEach(n -> show(n));
        for (Iterator<Integer> it = al.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }

    static void show(int n) {
        if (n > 10) {
            System.out.println(n);
        }
    }
}
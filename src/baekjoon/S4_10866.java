package baekjoon;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class S4_10866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Integer> deque = new LinkedList<>();

        while (n-- > 0) {
            String cmd = sc.next();
            switch (cmd) {
                case "push_front" -> deque.addFirst(sc.nextInt());
                case "push_back" -> deque.addLast(sc.nextInt());
                case "pop_front" -> System.out.println(deque.isEmpty() ? -1 : deque.pollFirst());
                case "pop_back" -> System.out.println(deque.isEmpty() ? -1 : deque.pollLast());
                case "size" -> System.out.println(deque.size());
                case "empty" -> System.out.println(deque.isEmpty() ? 1 : 0);
                case "front" -> System.out.println(deque.isEmpty() ? -1 : deque.peekFirst());
                case "back" -> System.out.println(deque.isEmpty() ? -1 : deque.peekLast());
            }
        }
    }
}
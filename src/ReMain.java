import java.util.PriorityQueue;
import java.util.Scanner;

class ReMain {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        PriorityQueue<Integer> pQ = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pQ.offer(kb.nextInt());
        }

        int answer = 0;

        // 최소 사이즈가 두 개 이상 있어야 한다
        while (pQ.size() > 1) {
            int a = pQ.poll();
            int b = pQ.poll();

            pQ.offer(a + b);
            answer += a + b;
        }

        System.out.println(answer);
    }
}

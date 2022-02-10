import java.util.Arrays;
import java.util.Scanner;

// 틀린 코드
// 반례 : ex) 4, 5, 6, 7
// 이 코드는 배열에 순서대로 값을 더하기 때문에
// total = 9 + 15 + 22 = 46이 된다
// 그러나 순서대로 하지 않고
// 4 5를 먼저 묶고 다음 6,7를 묶은 후 4, 5 더한 값과 6, 7 더한 값을 묶게 되면
// total = 9 + 13 + 21 = 42가 된다

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        Arrays.sort(arr);

        int sum = arr[0];
        int total = 0;
        for (int i = 1; i < n; i++) {
            sum += arr[i];
            total += sum;
        }

        System.out.println(total);
    }

}

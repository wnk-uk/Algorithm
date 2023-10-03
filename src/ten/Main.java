package ten;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char t = sc.next().charAt(0);

        System.out.println("s : " + s);
        System.out.println("t : " + t);

        int[] answer = new int[s.length()];
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                temp = 0;
                answer[i] = temp;
            } else {
                temp++;
                answer[i] = temp;
            }
        }

        temp = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) == t) {
                temp = 0;
            } else {
                temp++;
                answer[i] = Math.min(answer[i], temp);
            }
        }

        System.out.println(Arrays.toString(answer));

    }
}

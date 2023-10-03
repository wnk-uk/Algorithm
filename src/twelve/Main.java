package twelve;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        s = s.replace('#', '1').replace('*', '0');

        char[] answer = new char[s.length()/7];
        int cnt = 0;
        for (int i = 0; i < s.length(); i = i + 7) {
            String temp = s.substring(i, i + 7);
            int msg = Integer.parseInt(temp, 2);

            answer[cnt] = (char) msg;
            cnt++;
        }

        System.out.println(Arrays.toString(answer));

    }
}

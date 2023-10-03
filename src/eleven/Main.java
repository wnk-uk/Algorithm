package eleven;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            int cnt = 0;
            answer += temp;

            if (i + 1 < s.length()) {
                for (int j = i; j < s.length(); j++) {
                    if (temp == s.charAt(j)) {
                        i = j;
                        cnt++;
                    } else {
                        temp = s.charAt(j);
                        i = j - 1;
                        break;
                    }
                }
                if (cnt > 1) {
                    answer += cnt;
                }
            }
        }


        System.out.println(answer);
    }
}

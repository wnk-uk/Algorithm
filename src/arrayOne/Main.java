package arrayOne;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");

        int cnt = 1;
        int temp = Integer.valueOf(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (temp < Integer.valueOf(arr[i])) {
                temp = Integer.valueOf(arr[i]);
                cnt++;
            }
        }

        System.out.println(cnt);


    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(new Main().solution(s, c));
    }

    int solution(String s, char c) {

        int result = 0;
        if (s.length() < 100) {
            for(int i = 0; i < s.length(); i++) {
                 if (String.valueOf(c).toLowerCase().intern() == String.valueOf(s.charAt(i)).toLowerCase().intern()) {
                     //result++;
                 }
            }
        }
        return result;
    }

}

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MoneyTransfer {

    public static void main(String[] args) {

        //50000
        //10000
        //5000
        //1000
        //500
        //100
        //10
        //1

        Scanner sc = new Scanner(System.in);

        System.out.println("입력");
        int input = sc.nextInt();

        int[] result = new int[9];
        int[] amtArr = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};


        for (int i = 0; i < amtArr.length; i++) {
            int amt = amtArr[i];

            if (input / amt > 0) {
                result[i] = input / amt;
                input = input - (amtArr[i] * result[i]);
            } else {
                //result[i] = 0;
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }

    }

}

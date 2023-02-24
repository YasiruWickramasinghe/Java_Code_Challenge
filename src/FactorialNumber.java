import java.util.Scanner;

public class FactorialNumber {

    public void factorialNumber(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter factorial number:");
        int num = sc.nextInt();
        long sum = 1;

        for(int i = 1; i <= num; i++){
            sum = sum * i;
        }

        System.out.println(sum);
    }
}

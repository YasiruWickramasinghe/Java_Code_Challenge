import java.util.Scanner;

public class SumOfDigits {
    public void sumOfDigits(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        while(num != 0){
            int remainder = num % 10;
            sum = sum + remainder;
            num = num / 10;
        }
        System.out.println("Sum of Numbers " + sum);
    }
}

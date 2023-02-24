import java.util.Scanner;

public class FibonacciSeries {

    public void fibonacciSeries(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fibonacci number: ");
        int fib = sc.nextInt();

        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        System.out.print(num1+","+num2+",");

//using for loop
        for(int i = 2; i < fib; i++){
            sum = num1 + num2;
            System.out.print(sum + ",");
            num1 = num2;
            num2 = sum;
        }

//using while loop
//        while(fib != 2){
//            sum = num1 + num2;
//            System.out.print(sum + ",");
//
//            num1 = num2;
//            num2 = sum;
//            fib--;
//        }

    }
}

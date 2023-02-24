import java.util.Scanner;

public class LargestOfThreeNumbers {
    public void largestOfThreeNumbers(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Enter third number: ");
        int c = sc.nextInt();

        int largest = 0;

// logic 1 - using comparison if-else
//        if(a >= b && a >= c){
//            largest = a;
//        } else if (b >= a && b >= c) {
//            largest = b;
//        } else {
//            largest = c;
//        }
//        System.out.println("largest number is: " + largest);

// logic 2 - using ternary operator
        int largest1 = a > b ? a : b; // largest of a and b
        int largest2 = c > largest ? c : largest; // largest of firstlarge and c

        System.out.println("largest number is: " + largest2);
    }
}

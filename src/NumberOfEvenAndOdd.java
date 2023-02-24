import java.util.Scanner;

public class NumberOfEvenAndOdd {

    public void numberOfEvenAndOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int even = 0;
        int odd = 0;

        while(num != 0){
            int remainder = num % 10;

            if(remainder % 2 == 0){
                even++;
            }else {
                odd++;
            }

            num = num / 10;
        }

        System.out.println("Even Numbers: " + even);
        System.out.println("Odd Numbers: " + odd);

    }
}

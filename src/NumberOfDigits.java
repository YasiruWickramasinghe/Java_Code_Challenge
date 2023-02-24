import java.util.Scanner;

public class NumberOfDigits {
    public void numberOfDigits(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;

        while(num != 0){
            num = num / 10;
            count++;
        }

        System.out.println("Length is : " + count);
    }
}

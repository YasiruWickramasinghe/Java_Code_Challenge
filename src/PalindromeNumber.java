import java.util.Scanner;

public class PalindromeNumber {

    public void palindromeNumber(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = sc.nextInt();

        int orginal_number = num;

        //reverse number
        int rev = 0;
        while(num != 0){
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        System.out.println("reverse number:" + rev);

        if(orginal_number == rev){
            System.out.println(orginal_number + " is palindrome number");
        } else {
            System.out.println(orginal_number + " is not a palindrome number");
        }

    }
}

import java.util.Scanner;

public class PalindromeString {

    public void palindromeString(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.next();
        String orginal_string = str;

        int len = str.length();
        String rev = "";

        for(int i = len - 1; i >= 0l; i--){
            rev = rev + str.charAt(i);
        }

        System.out.println("Reverse: " + rev);

        if(orginal_string.equals(rev)){
            System.out.println(str + " is palindrome string");
        } else {
            System.out.println(str + " is not a palindrome string");
        }

    }
}

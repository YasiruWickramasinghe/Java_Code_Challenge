import java.util.Scanner;

public class ReverseNumber {

    public void reverseNumber(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num = scanner.nextInt(); //1234

        //logic 1 - using algorithm
//        int rev = 0;
//        while(num != 0){
//            rev = rev * 10 + num % 10;
//            num = num / 10;
//        }

        //logic 2 - using StringBuffer class
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();

        //logic 2 - using StringBuilder class
//        StringBuilder sb1 = new StringBuilder();
//        sb1.append(num);
//        StringBuilder rev = sb1.reverse();


        System.out.println("Reverse number is: " + rev);
    }
}

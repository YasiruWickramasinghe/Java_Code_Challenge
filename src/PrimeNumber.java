import java.util.Scanner;

public class PrimeNumber {

    public void primeNumber(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int count = 0;

        if(num > 1){
            for(int i = 1; i <= num; i++){
                if(num % i == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println("Prime number");
            }else {
                System.out.println("not a Prime number");
            }
        }else {
            System.out.println("not a Prime number");
        }
    }
}

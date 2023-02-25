import java.util.Scanner;

public class ArrayLinearSearch {
    public void arrayLinearSearch(){
        int arr[] = {21,54,56,32,45,20,15};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Searching Number: ");
        int num = sc.nextInt();

        boolean flag = false;
        for(int i = 0; i < arr.length; i++){
            if(num == arr[i]){
                System.out.println("number found " + arr[i]);
                flag = true;
                break;
            }
        }
        if(flag == false){
            System.out.println("number not found");
        }
    }
}

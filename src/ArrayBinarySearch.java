import java.util.Scanner;

public class ArrayBinarySearch {
    public void arrayBinarySearch(){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Searchable Number:");
        int key = sc.nextInt();

        int lower = 0;
        int higher = arr.length - 1;

        boolean flag = false;

        while(lower <= higher){
            int mid = (lower + higher) / 2;

            //check three conditions
            //1. key = mid
            //2. key > mid then lower = mid + 1
            //3. key < mid then highest = mid - 1

            if(key == arr[mid]){
                System.out.println("Found number: " + key);
                flag = true;
                break;
            } else if (key > arr[mid]) {
                lower = mid + 1;
            } else if (key <arr[mid]) {
                higher = mid - 1;
            }
        }
        if(flag == false){
            System.out.println("Number not found");
        }
    }
}

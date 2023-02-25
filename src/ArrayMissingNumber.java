public class ArrayMissingNumber {

    public void arrayMissingNumber(){
    //array should not have duplication
    //array no need to be sorted order
    //value should be in proper range

        int arr[] = {1,2,4,5}; //count = 12

        //sum1 = 1+2+4+5 = 12
        //sum2 = 1+2+3+4+5 = 15
        //missing number = sum2 - sum1 = 15 - 12 = 3

        int sum1 = 0;
        for(int i = 0; i < arr.length; i++){
            sum1 = sum1 + arr[i];
        }
        System.out.println("Sum of elements in array " +sum1);

        int lastElement = arr.length - 1;

        int sum2 = 0;
        for(int i = 1; i <= arr[lastElement]; i++){
            sum2 = sum2 + i;
        }
        System.out.println("Sum of range in array " +sum2);
        System.out.println("Missing number is " + (sum2 - sum1));
    }
}

public class ArraySumOfElement {

    public void arraySumOfElement(){
        int arr[] = {5,2,7,9,6};
        int sum = 0;

//logic 1 - using for loop
//
//        for(int i = 0; i <= arr.length - 1; i++){
//            sum = sum + arr[i];
//        }

//logic 1 - using enhanced for loop

        for(int value:arr){
            sum = sum + value;
        }

        System.out.println(sum);

    }
}

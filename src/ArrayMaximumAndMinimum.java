public class ArrayMaximumAndMinimum {

    public void arrayMaximumAndMinimum(){
         int arr[] = {19,12,31,14,5,67,34,1,986,2,65,78,445 };
         int max = arr[0];
         int min = arr[0];

         for (int i = 1; i < arr.length; i++){
             if(arr[i] > max){
                 max = arr[i];
             }
         }
        System.out.println("max :" + max);

        for (int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("min :" + min);
    }
}

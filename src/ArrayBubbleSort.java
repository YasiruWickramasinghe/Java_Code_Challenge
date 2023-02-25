import java.util.Arrays;

public class ArrayBubbleSort {
    public void arrayBubbleSort(){
        int arr[] = {45,12,78,65,41,21,12,45,85,25,94,3};

        System.out.println("Array before sorting " + Arrays.toString(arr));

        for(int j = 0; j <= arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println("Array After sorting " + Arrays.toString(arr));
    }
}

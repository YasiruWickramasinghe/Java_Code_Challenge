import java.util.Arrays;
import java.util.Collections;

public class ArraySortingElement {
    public void arraySortingElement(){

//logic 1 - using Array class's parallel sort method
//        int arr[] = {45,12,78,65,41,21,12,45,85,25,94,3};
//        System.out.println("Array before sorting " + Arrays.toString(arr));
//        Arrays.parallelSort(arr);
//        System.out.println("Array after sorting " + Arrays.toString(arr));

//logic 2 - using Array class's sort method
//        int arr[] = {45,12,78,65,41,21,12,45,85,25,94,3};
//        System.out.println("Array before sorting " + Arrays.toString(arr));
//        Arrays.sort(arr);
//        System.out.println("Array after sorting " + Arrays.toString(arr));

//logic 3 - reverse / descending order (here cannot use primitive type)
        Integer  a[] = {30,50,20,10,60};
        System.out.println("Array before reverse order" + Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("Array after reverse order" + Arrays.toString(a));

    }
}

import java.util.Arrays;

public class ArrayEquals {
    public void arrayEquals(){


        int arr1[] = {1,2,3,4,5,6,6};
        int arr2[] = {1,2,3,4,5,7,8};

//logic 1 - using Arrays Class
//        boolean status = Arrays.equals(arr1,arr2);
//
//        if(status == true){
//            System.out.println("two array are equal");
//        } else {
//            System.out.println("two array are not equal");
//        }

//logic 2 -
        boolean status = true;

        if(arr1.length == arr2.length){
            for(int i = 0; i < arr1.length; i++){

                if(arr1[i] != arr2[i]) {
                    status = false;
                }
            }
        } else {
            status = false;
        }

        if(status == true){
            System.out.println("two array are equal");
        } else {
            System.out.println("two array are not equal");
        }

    }
}

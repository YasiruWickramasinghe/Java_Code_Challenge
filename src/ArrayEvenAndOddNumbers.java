public class ArrayEvenAndOddNumbers {

    public void arrayEvenAndOddNumbers(){
        int arr[] = {1,5,4,7,2,5,10,5};

// logic 1 - using array
//        int even = 0;
//        int odd = 0;
//
//        //get count
//        for(int i = 0; i < arr.length; i++){
//           if(arr[i] % 2 == 0){
//               even++;
//           } else {
//               odd++;
//           }
//        }
//
//        System.out.println(even +" even numbers in array");
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] % 2 == 0){
//                System.out.println(arr[i]);
//            }
//        }
//
//        System.out.println(odd +" odd numbers in array equals");
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] % 2 != 0){
//                System.out.println(arr[i]);
//            }
//        }

// logic 2 - using enhanced array

        System.out.println("even numbers in array");
        for(int variable:arr){
            if(variable % 2 == 0){
                System.out.println(variable);
            }
        }
        System.out.println("odd numbers in array");
        for(int variable:arr){
            if(variable % 2 != 0){
                System.out.println(variable);
            }
        }

    }
}

import java.util.HashSet;

public class ArrayDuplicateElement {
    public void arrayDuplicateElement(){
        String arr[] = {"java","c","c++","python","java","javaScript","c","java"};

//logic 1 - get one element and compare with  other elements
//        boolean flag = false;
//        for (int i = 0; i < arr.length; i++){
//            for (int j = i + 1; j < arr.length; j++){
//                if(arr[i].equals(arr[j]) ){
//                    System.out.println("Found duplicate element: " + arr[i]);
//                    flag = true;
//                }
//            }
//        }
//        if(flag == false){
//            System.out.println("duplicate element not found");
//        }

//logic 2 - using HashSet data structure
        HashSet <String>languages = new HashSet();
//        System.out.println(languages.add("java"));
//        System.out.println(languages.add("python"));
//        System.out.println(languages.add("java"));
//
//        System.out.println(languages);

        boolean flag = false;
        for(String lang:arr){

            if(languages.add(lang) == false){
                System.out.println("Found duplicate element: " + lang);
                flag = true;
            }
        }
        if(flag == false){
            System.out.println("duplicate element not found");
        }
    }
}

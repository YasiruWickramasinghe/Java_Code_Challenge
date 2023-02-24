public class ReverseString {

    public void reverseString(){

        String str = "ABCDEDad";
        String rev = "";

// logic 1 - Using CharAt and Concatenation operation
//        int len = str.length();
//        for(int i = len - 1; i >= 0; i--){
//            rev = rev + str.charAt(i);
//        }
//        System.out.println("Reverse String is: " + rev);

// logic 2 - Using character array
//        char a[] = str.toCharArray();
//        int len = a.length;
//        for(int i =  len - 1; i >= 0; i--){
//            rev = rev + a[i];
//        }
//        System.out.println("Reverse String is: " + rev);

        // logic 3 - Using StringBuffer
        StringBuffer sb = new StringBuffer(str);
        System.out.println("Reverse String is: " + sb.reverse());



    }
}

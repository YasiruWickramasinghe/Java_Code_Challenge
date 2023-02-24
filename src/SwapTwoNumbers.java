public class SwapTwoNumbers {
    public void swapTwoNumbers(int a, int b) {

        System.out.println("Before " + a + " " + b);

//      logic 1 - using third variable
        int t = a;
        a = b;
        b = t;

        //logic 2 - without using third variable
//        a = a + b; // 10 + 20 = 30 (now a = 30)
//        b = a - b; // 30 - 20 = 10 (now b = 10)
//        a = a - b; // 30 - 10 = 20 (now a = 20)

        //logic 3 - without using third variable / a & b shoud not ne zero
//        a = a * b; // 10 * 20 = 30 (now a = 200)
//        b = a / b; // 200 / 20 = 10 (now b = 10)
//        a = a / b; // 200 / 10 = 20 (now a = 20)

        //logic 4 - bitwise XOR (^) using binary values
//        a = a ^ b; // 1010 ^ 10100 = 11110 (now a = 30)
//        b = a ^ b; // 11110 ^ 10100 = 1010 (now b = 10)
//        a = a ^ b; // 11110 ^ 1010 = 10100 (now a = 20)

        //logic 5 - single statement (a= 10, b = 20)
//        b = a + b - (a = b);

        System.out.println("After " + a + " " + b);
    }
}

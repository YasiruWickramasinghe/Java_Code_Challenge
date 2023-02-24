import java.util.Random;

public class RandomNumber {

    public void randomNumber(){

//logic 1 - using random class
        Random rand = new Random();

        int random_int = rand.nextInt(100);
        System.out.println(random_int);

        double random_deci = rand.nextDouble();
        System.out.println(random_deci);

// logic 2 - using math class - generate only decimal numbers
//        System.out.println(Math.random());

// logic 3 - using Apache common-lang API to generate random strings





    }
}

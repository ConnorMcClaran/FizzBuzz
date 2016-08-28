/**
 * Created by mcclarci on 8/26/2016.
 */
public class Fizz_Buzz {

    public static void main(String[] args) {   // Every program must have main()
        for(int i = 1; i <= 100; i++) {                    // count from 1 to 100
            if (((i % 3) == 0) && ((i % 5) == 0))            // A multiple of both?
                System.out.print("fizzbuzz");
            else if ((i % 3) == 0) System.out.print("fizz"); // else a multiple of 3?
            else if ((i % 5) == 0) System.out.print("buzz"); // else a multiple of 5?
            else System.out.print(i);                        // else just print it
            System.out.print(" ");
        }
        System.out.println();
    }
}

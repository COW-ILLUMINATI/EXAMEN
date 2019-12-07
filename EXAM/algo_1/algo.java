
/**
 * 
 * @author Victor Gerlich <cow.illuminati@gmail.com>
 * @version 4613732
 * 
 */

class Main {

    public static void main(String[] args) {

        // declares final value
        int cnt = 0;

        // loops though all numbers smaller than 1000 (starting at 0)
        for (int x = 0; x < 1000; x++) {

            // modular division -- if equ 0 then it is divisible
            if (x % 3 == 0 || x % 5 == 0) {

                // adds value
                cnt += x;
            }

        }

        // gives result
        System.out.print("\n\n\n\n" + cnt);
    }
}
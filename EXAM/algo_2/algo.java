
/**
 * 
 * @author Victor Gerlich <cow.illuminati@gmail.com>
 * @version φ   see what i did there? ( ͡° ͜ʖ ͡°)
 * 
 */
class Main {

    public static void main(String[] args) {

        int fibb = 1;
        int total = 0;

        while (fibb <= 4000000) {

            // goes up
            fibb += Math.round(fibb * (Math.sqrt(5) - 1) / 2);
            // all right so this is what it's doing:

            // first of all i want to note that this is more efficient since we can save up
            // to 42 bits of random access memory (the other common technique uses a second
            // value and a temporary)
            // this method also look alot smarter

            // so basically every number in the fibonacci set divided by the previous one
            // will converge towards the golden ration (for more info look
            // here: https://en.wikipedia.org/wiki/Golden_ratio

            // this magical number is also the result of (sqr(5)-1)/2
            // therefore multiplying it with a number in the fibonacci sequence will return
            // the previous number
            // we then proceed to add it to itself & round it in order to get the next term
            // of the sequence, then repeat

            // if pair
            // check if divisor of 2 using MODULAR DIVISION method
            if (fibb % 2 == 0) {
                // adds up
                total += fibb;
            }

        }
        System.out.print("\n\n" + total);
    }
}
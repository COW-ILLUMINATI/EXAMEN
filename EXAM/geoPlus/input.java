

/**
 * 
 * @author Cow_illuminati <cow.illuminati@gmail.com>
 * @version sqrt(2)
 * 
 * 
 */


//java does its own little thing..
import java.util.Scanner;

class input {

    /**
     *
     * gets integer input from user if non-integer input is sent, will be reprompted
     * 
     * @param (none)
     * @return (integer user input)
     * 
     */

    public int keyInt() {

        // this module is used to get keyboard input from the user
        Scanner scan = new Scanner(System.in);
        

        // the integer 'rtn' stands for 'RETURN':
        // it will temporarily hold the return value before the code has finished
        // executing
        int rtn = 0;

        // this boolean defines if the user must send in a new input or if the code can
        // finish execution
        // TRUE=reprompt (if there was an error in the input)
        // FALSE=no need to reprompt: the code can finish executing and return the
        // inputed integer

        boolean redo = true;

        // this loop will run until integer input was successfull (read comments above
        // for further information)
        while (redo) {
            // this will atempt getting a input from the user
            try {
                // gets input and make it into an integer
                rtn = Integer.parseInt(scan.nextLine());
                // flags that the input was indeed an integer
                redo = false;

            } catch (Exception e) {
                // if the input was not an integer:

                // alert!
                System.out.println("Must be integer!");

                // flags the input must be redone
                redo = true;
            }
        }

        return rtn;
        
    }

}

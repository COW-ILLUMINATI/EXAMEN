

/**
 * 
 * @author Cow_illuminati <cow.illuminati@gmail.com>
 * @version sqrt(2)
 * 
 * 
 */


class point {

    /**
     * prompts for point x coord
     * 
     * @param (point that will be prompted for)
     * @return (integer user input for point's coord)
     * 
     */

    

    public static int x(int num) {
        
        // imports in unefficient i was told to last min.
        input input=new input();
        
        // q
        System.out.print("\nEnter point [" + num + "]'s X : ");
        // a
        return input.keyInt();
    }

    /**
     * prompts for point y coord
     * 
     * @param (point that will be prompted for)
     * @return (integer user input for point's coord)
     * 
     */
    public static int y(int num) {
        
        // imports in unefficient i was told to last min.
        input input=new input();
        
        // q
        System.out.print("Enter point [" + num + "]'s Y : ");
        // a
        return input.keyInt();
    }
}

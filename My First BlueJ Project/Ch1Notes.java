
/**
 * Elaina Malczewski
 * 8/23/22
 * Chapter 1 Notes
 * Class notes on basic concepts
 * Who helped me: 
 *
 */
public class Ch1Notes
{
    

    /**
     * this is our code notes
     */
    public static void main(String[] args)
    {
        //basic data types
        double number = 8.9, number2;
        int x = 9,y,z;
        boolean choice = false;
        char letter = 'b'; // single character
        
        float number3 = 8; // less memory than double
        long n2 = 3; // integer with 8 bytes
        short n3 = 7; // less memory than long
        
        // these are Classes and Objects
        // Class   ID             memory    Constructor
        // Name    (variable)
        Integer    n1 =           new       Integer(47);
        String     word =         new       String("Elaina Malczewski"); // multiple characters
        Double     number4 =      new       Double(6.7);
        
        //                    method (attatched to object) / function
        System.out.print(word.length());
        
    }
}

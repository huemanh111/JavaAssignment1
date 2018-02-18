package huynhassignment1;

/**
 *
 * @author Hue Anh Huynh
 */

/*
Write a Java program such that each time when your program runs, it automatically
generates random numbers for your array, and then these random numbers are sorted
and printed out on the screen. To do so, you need to import something, which helps
generate random numbers, from Java library. In addition, you have to allocate space for
your array using dynamic storage allocation command, say new. Your program should
behave similar to the one shown at
http://storm.cis.fordham.edu/~ramos/java/assignment1/
*/
public class HuynhAssignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner numInput = new Scanner(System.in); //used for user input
        int randArray[] = new int[7]; //7 element array composed of random ints
        int temp; //placeholder for sorting later on
        
        //GENERATING ARRAY OF 7 RANDOM INTEGERS
        System.out.print("       Array: ");
        for(int i = 0; i < randArray.length; i++) {
            randArray[i] = (int)(Math.random()*1000); //since the random function returns a double you gotta cast it to an integer
            System.out.print(randArray[i] + "   ");
        }
        System.out.println();
        
        //SORTING THE ARRAY
        System.out.print("Sorted Array: ");
        for(int i = 0; i < randArray.length; i++) {
            for(int j = i + 1; j < randArray.length; j++) {
                if(randArray[i] > randArray[j]) {
                    temp = randArray[j];
                    randArray[j] = randArray[i];
                    randArray[i] = temp;
                }
            }
            System.out.print(randArray[i] + "   ");
        }
        System.out.println();
    }
}

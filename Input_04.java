package sinya_jaba2Pack;

import java.util.Scanner;

public class Input_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(Input_04.class.getResourceAsStream("input04text.txt"));      
        
        //Edit these lines to advance the scanner
        sc.nextLine();
        sc.nextLine();
        
        System.out.println(sc.nextLine());

        
        
        //Does this line contain "BlueBumper"?
        System.out.println(sc.findInLine("BlueBumper"));
        int x =sc.nextInt ();
        int y =sc.nextInt ();
        //Store the next two numbers as xPosition and yPosition
        //Print these positions
        
        
        System.out.println("X: "  +x      +", Y: "     +y   );
        sc.close();
    }    
}
	
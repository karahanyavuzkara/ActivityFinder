package patika;
import java.util.Scanner;
public class ActivityFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		System.out.print(" Enter the temperature : ");
	Scanner input = new Scanner(System.in);
	
	int temp;
    temp = input.nextInt();
	
    if (temp < 5 ) {
    	
      System.out.print("You can go to skiing. ");
    }
    else if (temp < 15) {
	 System.out.print("You can go to watch sinema. ");
    
	}
	else if ( temp < 25 ) {

        
		System.out.print("You can go to camp. ");
		
	}
	else if ( temp > 25 ) {
        
		 System.out.print("You can go to swimming. ");
	}
}
}
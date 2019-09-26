package läxav39;

import java.util.Scanner;

public class quadrant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner input = new Scanner(System.in);

		        int x = input.nextInt();
		        int y = input.nextInt();
		        
		        if (0 < x && y > 0) {
		        	System.out.println(1);
		        }
		        
		        else if (0 < x && y < 0) {
		        	System.out.println(2);
		        }
		        
		        else if (0 > x && y < 0) {
		        	System.out.println(3);
		        }
		        
		        else if (0 > x && y > 0) {
		        	System.out.println(4);
		        }
		        input.close();



	}

}

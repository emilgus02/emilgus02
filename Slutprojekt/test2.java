import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean igen = true;
		
		do {
			String p = input.next();
			if (p.contains("1")) {
				
			} else {
				igen = false;
			}
			
		} while (igen == true);
		
	}
}
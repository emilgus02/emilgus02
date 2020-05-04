import java.io.FileInputStream;
import java.

public class test5 {

	public static void main(String[] args){
		 FileInputStream in = null;
	      try {
			
		
	         in = new FileInputStream("C:\\Users\\emil.gustafsson7\\Documents\\GitHub\\emilgus02\\Slutprojekt\\Easy.txt");
	         read = read("Easy.txt");
	         
	         System.out.println(in);
	      } catch (Exception e) {
	    	  System.out.println(in);
				System.out.println(e);
			}
	}

	private static Object read(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}

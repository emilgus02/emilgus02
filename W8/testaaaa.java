import java.util.Scanner;

import com.sun.xml.internal.ws.util.StringUtils;

public class testaaaa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String ord = input.next();
		if (StringUtils.capitalize(ord) == null) {
			System.out.println("rätt");
		}
		else {
			System.out.println("fel");
		}
	}

}

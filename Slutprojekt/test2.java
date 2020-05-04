import java.util.ArrayList;
import java.util.Scanner;

import com.sun.xml.internal.ws.util.StringUtils;

public class test2 {

	public static void main(String[] args) {
		char Gissning = 'p';
		String kollar = String.valueOf(Gissning);
		ArrayList<String> använda = new ArrayList<String>();
		använda.add("k");
		använda.add(kollar);
		System.out.println(använda.get(0));
	}
}
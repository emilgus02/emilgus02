import java.util.ArrayList;
import java.util.Scanner;

import com.sun.xml.internal.ws.util.StringUtils;

public class test2 {

	public static void main(String[] args) {
		char Gissning = 'p';
		String kollar = String.valueOf(Gissning);
		ArrayList<String> anv�nda = new ArrayList<String>();
		anv�nda.add("k");
		anv�nda.add(kollar);
		System.out.println(anv�nda.get(0));
	}
}
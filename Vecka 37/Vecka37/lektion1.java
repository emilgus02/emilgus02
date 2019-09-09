package Vecka37;

public class lektion1 {

	public static void main(String[] args) {
		// Ett sätt att skriva kommentarer
		/* Ett annat sätt att skriva kommentarer 
		 */

		int heltal1=25; // skapar en låda som heter heltal1 och fyller den med ett heltal
		int svar; // deklarera 
		
		svar = heltal1*heltal1;
		
		System.out.println("Svar: " + heltal1*heltal1); // + tecknet kallas konkatinera
		
		double pi = 3.14;
		int radie = 5;
		
		double area = pi*radie*radie;
		
		System.out.println("Arean är: " + area + " cm^2");
	
	    long stortHeltal = 200000000000L;
		
		System.out.println(stortHeltal+1);
	}

}

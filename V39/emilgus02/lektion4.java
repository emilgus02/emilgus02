package emilgus02;

public class lektion4 {

	public static void main(String[] args) {
		
		//Anv�nds n�r man vet exakt hur m�nga g�nger man vill repetera
		
		//skriver ut 0-4
		for (int i=0; i < 5; i++) {
			System.out.println(i);
		}
		
		//skriver ut 5-1
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}
		
		//skriver ut alla j�mna tal under 100
		for (int i = 0; i < 100; i += 2) {
			System.out.println(i);
		}
		
		//skriver ut alla udda tal
		for (int i = 1; i < 100; i+= 2) {
			System.out.println(i);
		}
		
		//skriver ut alla g�nger-tabbeller f�r talen 1-10
		for (int i = 1; i <= 10; i++) {
		
			for (int j =1; j <=10; j++) {
			System.out.println(i * j + " ");
		}
		System.out.println();
		}
		
		

	}

}

package emilgus02;

public class stirngarrayer {

	public static void main(String[] args) {

		String[] namn = { "Malte", "Emil", "Petter", "Linus" };
		
		for (int i = 0; i < 40; i++) {
			
			for (int j = 0; j < namn.length; j++) {
				i = i+1;
				
				System.out.println( i + ". " + namn[j]);
			}
			i--;
		}
	}

}

package emilgus02;

public class arraylektion2 {

	public static void main(String[] args) {

		double[] number = new double[20];
		double[] numbers2 = { 12.2, 32, -45.17474347837 };

		String[] namn = { "Gabriel", "Petter", "Ida", "Malte", "Kalle", "Emil" };
		
		int antalA = 0;
		
		for (int i = 0; i < namn.length; i++) {
			
			
			for (int j = 0; j < namn[i].length(); j++) {
				if (namn[j].contains('L')){
					antalA++;
				}
			}
		
			
		}
		System.out.println("Antal A:n är" + antalA );

	}

}
